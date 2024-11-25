import java.util.Scanner;

public class Lesson_10 {
    static int nationPosition(String nation) {
        String[] nationsArr = {
                "Germany", "Ireland", "Poland", "Scotland"
        };
        for (int i = 0; i < nationsArr.length; i++) {
            if (nationsArr[i].equalsIgnoreCase(nation)) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
//        String[][] arr = {
//                {"Kenya", "Nairobi"}, {"Rwanda", "Kigali"},
//                {"Gambia", "Banjul"}, {"Ghana", "Accra"},
//                {"Niger", "Niamey"}, {"Zambia", "Lusaka"}
//        };
//        Scanner sc = new Scanner(System.in);
//        String country = sc.next();
//        boolean notFound = true;
//        for (String[] item: arr) {
//            if (item[0].equalsIgnoreCase(country)) {
//                notFound = false;
//                System.out.println(item[1]);
//            }
//        }
//        if (notFound) {
//            System.out.println("The country that you entered is not found");
//        }
//        String[][] arr = {
//            {"Germany", "2", "Scotland", "1"},
//            {"Poland", "2", "Germany", "0"},
//            {"Germany", "1", "Ireland", "1"},
//            {"Poland", "2", "Scotland", "2"},
//            {"Scotland", "1", "Ireland", "0"},
//            {"Ireland", "1", "Poland", "1"},
//            {"Ireland", "1", "Scotland", "1"},
//            {"Germany", "3", "Poland", "1"},
//            {"Scotland", "2", "Germany", "3"},
//            {"Ireland", "1", "Germany", "0"},
//            {"Scotland", "2", "Poland", "2"},
//            {"Poland", "2", "Ireland", "1"}
//        };
//        int[] teams = {0, 0, 0, 0};
//        int home_scores, away_scores, home_team, away_team;
//
//        for (String[] game: arr) {
//            home_team = nationPosition(game[0]);
//            away_team = nationPosition(game[2]);
//
//            home_scores = Integer.parseInt(game[1]);
//            away_scores = Integer.parseInt(game[3]);
//
//            if (home_scores > away_scores) {
//                teams[home_team] += 3;
//            } else if (home_scores < away_scores) {
//                teams[away_team] += 3;
//            } else {
//                teams[home_team] += 1;
//                teams[away_team] += 1;
//            }
//        }
//        for (int i = 0; i < teams.length; i++) {
//            System.out.print(teams[i] + " ");
//        }
        int[][][] opers = {
                { {100, -50, 25}, {150,-300}, {300,-90,100} },
                { {90, -60, 250}, {300,20,-100} },
                { {20, 50}, {300}, {20,-20,40}, {100,-200} }
        };
        int[] customers = new int[opers.length];
        int sum;
        for (int i = 0; i < opers.length; i++) {
            sum = 0;
            for (int j = 0; j < opers[i].length; j++) {
                for (int k = 0; k < opers[i][j].length; k++) {
                    sum += opers[i][j][k];
                }
            }
            customers[i] = sum;
        }

        for (int i = 0; i < customers.length; i++) {
            System.out.println(customers[i]);
        }

    }
}
