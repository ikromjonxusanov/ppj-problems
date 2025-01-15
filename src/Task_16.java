
public class Task_16 {
    static boolean checkpass(String password) {
        int leastChar = password.length(),
                leastDiffChar = 0, leastDigit = 0, leastUpper = 0,
                leastLower = 0, leastNonAl = 0;
        boolean res = true;
        for (int i = 0; i < password.length(); i++) {
            boolean sameExist = false;
            for (int j = i + 1; j < password.length(); j++) {
                if (password.charAt(i) == password.charAt(j)) {
                    sameExist = true;
                    break;
                }
            }
            if (!sameExist) {
                leastDiffChar++;
            }
        }
        for (char c : password.toCharArray()) {
            if ('a' <= c && c <= 'z') {
                leastLower++;
            }
            if ('A' <= c && c <= 'Z') {
                leastUpper++;
            }
            if ('0' <= c && c <= '9') {
                leastDigit++;
            }
            if (!('a' <= c && c <= 'z') && !('A' <= c && c <= 'Z') && !('0' <= c && c <= '9')) {
                leastNonAl++;
            }
        }
        if (leastChar < 8) {
            System.out.println("Too short");
            res = false;
        }
        if (leastDiffChar < 6) {
            System.out.println("Too few different characters");
            res = false;
        }
        if (leastDigit < 1) {
            System.out.println("No Digit");
            res = false;
        }
        if (leastUpper < 1) {
            System.out.println("No Upper Letter");
            res = false;
        }
        if (leastLower < 1) {
            System.out.println("No Lower Letter");
            res = false;
        }
        if (leastNonAl < 1) {
            System.out.println("No Non Alphabet letter");
            res = false;
        }
        return res;
    }

    public static void main(String[] args) {

        String[] passes = {"AbcDe93", "A1b:A1b>", "Ab:Acb<",
                "abc123><", "Zorro@123"};
        for (String pass : passes) {
            System.out.println("\nchecking " + pass);
            if (checkpass(pass)) System.out.println("OK");
        }
    }
}
