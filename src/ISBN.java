import java.util.*;

public class ISBN {

    static void checkISBN(String isbn) {
        System.out.print(isbn + " ");
        isbn = isbn.replace("-", "");
        if (isbn.length() > 10) {
            System.out.print("Error: there are too many digits\n");
            return;
        } else if (isbn.length() < 10) {
            System.out.print("Error: there are too few digits\n");
            return;
        }
        int sum = 0;
        for (int i = 0; i < isbn.length(); i++) {
            char ch = isbn.charAt(i);
            if ((48 <= ch && ch <= 57) || ch == 88) {
                int digit = ch == 'X' ? 10 : Character.getNumericValue(ch);
                sum += digit * (10 - i);
            } else {
                System.out.print("Error: invalid character " + ch + "\n");
                return;
            }
        }
        if (sum % 11 == 0) {
            System.out.print("OK\n");
        } else {
            char lastCh = isbn.charAt(isbn.length() - 1);
            int lastDigit = lastCh == 'X' ? 10 : Character.getNumericValue(lastCh);
            sum -= lastDigit;
            int correctDigit = (11 - (sum % 11));
            char correctCh = (correctDigit == 10) ? 'X' : Character.forDigit(correctDigit, 10);
            System.out.print("ERROR Check digit should be " + correctCh + "\n");
        }
    }

    public static void main(String[] args) {
        String[] isbns = {
                "960-425-059-0", "80-902744-1-6", "85-359-0277-5",
                "0-8044-2958-X", "0-943396-04-2", "0-9752298-0-5",
                "9971-5-02l0-0", "93-8654--21-4", "99921-588-107",
        };

        for (int i = 0; i < isbns.length; ++i) {
            checkISBN(isbns[i]);
        }
    }
}