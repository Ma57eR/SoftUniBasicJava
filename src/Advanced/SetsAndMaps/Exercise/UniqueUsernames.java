package Advanced.SetsAndMaps.Exercise;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class UniqueUsernames {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        Set<String> usernames = new LinkedHashSet<>();

        for (int i = 0; i < n; i++) {
            String input = scan.nextLine();
            usernames.add(input);
        }
        for (String username : usernames) {
            System.out.println(username);
        }
    }
}
