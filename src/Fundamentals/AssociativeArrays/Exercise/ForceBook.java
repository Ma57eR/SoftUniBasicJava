package Fundamentals.AssociativeArrays.Exercise;

import java.util.*;

public class ForceBook {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //Уникални форсюзъри само
        String data = scan.nextLine();
        String[] input = new String[data.length()];
        String command = "";
        //Метода проверява кой от двата сплитера е ползван
        if (data.contains("|")) {
            input = data.split(" \\| ");
            command = "|";
        } else {
            input = data.split(" -> ");
            command = "->";
        }
        Map<String, List<String>> users = new TreeMap<>();

        while (!input[0].equals("Lumpawaroo")) {
            String user;
            String side;
            //Ако е | и го няма, добавяме
            //Ако е -> и го има, проверяваме на чия страна е и променяме при нужда.
            //Също принтваме, че е джойнал към дадената страна
            switch (command) {
                case "|":
                    user = input[1];
                    side = input[0];
                    if (!users.containsKey(side)) {
                        users.put(side, new ArrayList<>());
                    }
                    users.get(side).add(user);

                    break;
                case "->":
                    user = input[0];
                    side = input[1];
                    if (!isUserExist(users, user, side)) {
                        if (!users.containsKey(side)) {
                            users.put(side, new ArrayList<>());
                        }
                        users.get(side).add(user);
                        System.out.printf("%s joins the %s side!%n", user, side);
                    } else {
                        isUserSameSide(users, user, side);
                        System.out.printf("%s joins the %s side!%n", user, side);
                    }

                    break;
            }
            data = scan.nextLine();
            input = new String[data.length()];
            if (data.contains("|")) {
                input = data.split("\\s+\\|\\s+");
                command = "|";
            } else {
                input = data.split("\\s+->\\s+");
                command = "->";
            }
        }

        users
                .entrySet()
                .stream()
                //Сортира по низходящ ред по размер на списъка
                .sorted((o1, o2) -> Integer.compare(o2.getValue().size(), (o1.getValue().size())))
                .forEach(entry -> {
                    //Проверка дали в списъка има юзъри
                    if (entry.getValue().size() > 0) {
                        System.out.println("Side: " + entry.getKey() + ", Members: " + entry.getValue().size());
                        //Сортиране във възходящ ред на юзърите
                        entry.getValue().sort(String::compareTo);
                        //Принтиране на юзърите в дадена страна
                        for (int i = 0; i < entry.getValue().size(); i++) {
                            System.out.println("! " + entry.getValue().get(i));
                        }
                    }
                });
    }

    private static void isUserSameSide(Map<String, List<String>> users, String user, String side) {
        for (Map.Entry<String, List<String>> entry : users.entrySet()) {
            if (entry.getValue().contains(user) && !entry.getKey().contains(side)) {
                entry.getValue().remove(user);
            }
        }
        if (!users.containsKey(side)) {
            users.put(side, new ArrayList<>());
        }
        users.get(side).add(user);
    }

    private static boolean isUserExist(Map<String, List<String>> users, String user, String side) {
        for (List<String> value : users.values()) {
            if (value.contains(user)) {
                return true;
            }
        }
        return false;
    }
}
