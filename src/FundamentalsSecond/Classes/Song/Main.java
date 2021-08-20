package FundamentalsSecond.Classes.Song;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numberOfSongs = Integer.parseInt(scan.nextLine());
        List<Song> songs = new ArrayList<>();

        for (int i = 0; i < numberOfSongs; i++) {
            String[] input = scan.nextLine().split("_");
            String typeList = input[0];
            String name = input[1];
            String time = input[2];

            Song song = new Song(typeList, name, time);
            songs.add(song);

        }
            String typeListFilter = scan.nextLine();

            if (typeListFilter.equals("all")) {
                songs.forEach(s -> System.out.println(s.name));
            } else {
                songs.stream()
                        .filter(s -> s.typeList.equals(typeListFilter))
                        .forEach(s -> System.out.println(s.name));
            }


    }
}

