record EAddress(String user, String domain) {
    @Override
    public String toString() {
        return user + "@" + domain;
    }
}
record Email(EAddress sender, EAddress recipient, String message) {}

class MailUtils {

    public static void sort(Email[] emails) {
        
    }

    public static void printMails(Email[] emails) {
        for (Email email :emails) {
            System.out.println(email.sender() + "->" + email.recipient() + ": " + email.message());
        }
    }

    public static Email[] bulkMail(EAddress sender, EAddress[] recipients, String message) {
        Email[] arr = new Email[recipients.length];
        for (int i = 0; i < recipients.length; i++) {
            arr[i] = new Email(sender, recipients[i], message);
        }
        return arr;
    }
}

public class Task_15 {
    public static void main(String[] args) {
        EAddress[] senders = {
                new EAddress("d", "ab.com"),
                new EAddress("e", "cd.gov"),
                new EAddress("d", "cd.gov"),
                new EAddress("a", "ef.org"),
                new EAddress("e", "ab.com"),
                new EAddress("b", "cd.gov")
        };

        EAddress[] recipients = {
                new EAddress("y", "ab.com"),
                new EAddress("x", "gh.gov"),
                new EAddress("z", "gh.gov"),
                new EAddress("u", "az.org"),
                new EAddress("x", "ab.com"),
                new EAddress("x", "cd.gov")
        };

        String[] messages = {
                "abc", "def", "ghi", "jkl", "mno", "pqr"};

        Email[] emails = new Email[senders.length];
        for (int i = 0; i < emails.length; ++i)
            emails[i] = new Email(senders[i], recipients[i],
                    messages[i]);

        MailUtils.sort(emails);
        MailUtils.printMails(emails);
        Email[] bulkEmails = MailUtils.bulkMail(
                senders[0], recipients, "ABC");
        MailUtils.printMails(bulkEmails);
    }
}