import java.io.IOException;
import java.io.InputStream;

public class BytesChars {
    public static void main(String[] args) {
        System.out.print("Type something and press enter ==> ");
        InputStream is = System.in;
        try {
            char c = ' ';
            while (true) {
                int i = is.read();
                c = (char) i;
                if (c == '\r' || c == '\n') break;
                System.out.printf("%3d ('", i);
                System.out.println(c + "') =>" +
                        " digit: " + Character.isDigit(c) +
                        " letter: " + Character.isLetter(c) +
                        " white: " + Character.isWhitespace(c)
                );
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
