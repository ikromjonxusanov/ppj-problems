public class MyString {
    private String str = "";
    public MyString(String str) {
        this.str = str;
    }
    public int getLength() {
        return str.length();
    }
    public String getChar(int n) {
        if (n >= str.length() || n < 0) {
            throw new IllegalArgumentException("Argument is out of range");
        }
        return String.valueOf(str.charAt(n));
    }

    public void append(String s) {
        str += s;
    }
    public void append(int rep, String s) {
        for (int i = 0; i < rep; i++) {
            str += s;
        }
    }
    public void prepend(String s) {
        str = s + str;
    }

    public void insert(int pos, String s) {
        if (pos >= str.length() || pos < 0) {
            throw new IllegalArgumentException("Argument is out of range");
        }
        String newStr = "";
        for (int i = 0; i < str.length(); i++) {
            if (pos == i) {
                newStr += s;
            }
            newStr += str.charAt(i);
        }
        str = newStr;
    }

    public void reset(String s) {
        str = s;
    }

    @Override
    public String toString() {
        return str;
    }
}
