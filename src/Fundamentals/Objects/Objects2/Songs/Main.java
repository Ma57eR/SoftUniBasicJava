package Fundamentals.Objects.Objects2.Songs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numOfSongs = Integer.parseInt(scan.nextLine());
        List<Song> songs = new ArrayList<>();

        for (int i = 1; i <= numOfSongs; i++) {
            String[] input = scan.nextLine().split("_");
            String type = input[0];
            String name = input[1];
            String time = input[2];
            Song currentSong = new Song(type, name, time);
            songs.add(currentSong);
        }
        String command = scan.nextLine();

        if (command.equals("all")) {
            for (Song currentSong : songs) {
                System.out.println(currentSong.getName());
            }
        } else {
            for (Song currentSong : songs) {
                if (currentSong.getType().equals(command)) {
                    System.out.println(currentSong.getName());
                }
            }
        }
    }
}





