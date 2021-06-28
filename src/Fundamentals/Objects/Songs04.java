package Fundamentals.Objects;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Songs04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        List<Song> songs = new ArrayList<>();

        for (int field = 1; field <= n ; field++) {
            String[] info = scan.nextLine().split("_");
            String type = info[0];
            String name = info[1];
            String time = info[2];

            Song song = new Song(type, name, time);
            songs.add(song);

        }

        String type = scan.nextLine();

        if (type.equals("all")) {
            for (Song song : songs) {
                System.out.println(song.name);
            }
        } else {
            for (Song song : songs) {
                if (song.getType().equals(type)) {
                    System.out.println(song.name);
                }
            }
        }



    }

    public static class Song {
        private String type;
        private String name;
        private String time;

        public Song(String type, String name, String time) {
            this.type = type;
            this.name = name;
            this.time = time;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }
    }
}