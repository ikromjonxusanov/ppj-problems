import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {
    private final Socket socket;
    private final BufferedReader input;
    private final PrintWriter output;
    private final ExecutorService service;
    private volatile boolean isRunning;

    public Client(String host, int port) throws IOException {
        this.socket = new Socket(host, port);
        this.input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        this.output = new PrintWriter(socket.getOutputStream(), true);
        this.service = Executors.newFixedThreadPool(2);
    }

    public void start() {
        isRunning = true;

        service.execute(new ServerListener(input, this));

        service.execute(() -> {
            try (Scanner scanner = new Scanner(System.in)) {
                while (isRunning) {
                    String message = scanner.nextLine();
                    if ("exit".equalsIgnoreCase(message)) {
                        stop();
                    } else {
                        output.println(message);
                    }
                }
            } catch (Exception e) {
                if (isRunning) {
                    System.err.println("Error reading input: " + e.getMessage());
                }
            }
        });
    }

    public void stop() {
        isRunning = false;
        System.out.println("Disconnecting from the server...");
        try {
            if (socket != null && !socket.isClosed()) {
                socket.close();
            }
        } catch (IOException e) {
            System.err.println("Error closing client socket: " + e.getMessage());
        } finally {
            service.shutdown();
        }
        System.out.println("Client disconnected.");
    }

    public boolean isRunning() {
        return isRunning;
    }

    public static void main(String[] args) {
        String serverAddr = "192.168.0.19";
//        String serverAddr = "172.23.73.25";
        int port = 58965;
        try {
            Client client = new Client(serverAddr, port);
            client.start();
        } catch (IOException e) {
            System.err.println("Failed to connect: " + e.getMessage());
            System.err.println(
                    "Host: " + serverAddr +
                            "\nPort: " + port +
                            "\n" +
                            "Please verify the host and port details, try again. If the issue persists, contact me).\n");
        }
    }
}

class ServerListener implements Runnable {
    private final BufferedReader input;
    private final Client client;

    public ServerListener(BufferedReader input, Client client) {
        this.input = input;
        this.client = client;
    }

    @Override
    public void run() {
        try {
            String message;
            while (client.isRunning() && (message = input.readLine()) != null) {
                if (message.contains("[")) {
                    System.out.println(message);
                } else {
                    System.out.print(message);
                }
            }
        } catch (IOException e) {
            if (client.isRunning()) {
                System.err.println("Connection to server lost: " + e.getMessage());
            }
        }
        System.err.println("Goodbye, see you again.");
        System.exit(0);
    }
}
