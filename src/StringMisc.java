import java.util.Locale;

public class StringMisc {
    public static String norm(String name) {
        String result = String.valueOf(name.charAt(0)).toUpperCase();
        for (int i = 1; i < name.length(); i++) {
            result += String.valueOf(name.charAt(i)).toLowerCase();
        }
        return result;
    }
    public static String init(String name) {
        String result = "";
        String[] arr = name.split(" ");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length-1) {
                result += norm(arr[i]);
                continue;
            }
            result += String.valueOf(arr[i].charAt(0)).toUpperCase() + ". ";
        }
        return result;
    }
    public static String tr(String s,
                            String from, String to) {
        char[] char_arr = new char[256];
        String result = "";
        for (int i = 0; i < 256; i++) {
            char_arr[i] = (char) i;
        }
        for (int i = 0; i < from.length(); i++) {
            char_arr[from.charAt(i)] = to.charAt(i);
        }
        for (char c: s.toCharArray()) {
            result += String.valueOf(char_arr[c]);
        }

        return result;
    }

    public static void main (String[] args) {
        System.out.println(norm("caravaggio"));
        System.out.println(norm("VERMEER"));

        System.out.println(init("johann sebastian bach"));
        System.out.println(init("i. babeL"));
        System.out.println(init("jorge LUIS BORGES"));
        System.out.println(init("WOLFGANG a. mozart"));

        System.out.println(tr("Mississippi",
                "abcdefghijklmnopqrstuvwyz",
                "BCDEFGHIJKLMNOPQRSTUVWYZA"));
        System.out.println(tr("abcXYZ","aZcX","||Cx"));
    }
}