package Fundamentals.Objects.Songs;

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
            //Създаваме нов обект сонг
            Song song = new Song(type, name, time);
            //Добавяме новия обект в листа с обекти
            songs.add(song);

        }
    }
}
