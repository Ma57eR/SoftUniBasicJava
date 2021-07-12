package Fundamentals.Objects.Objects2.Songs;

public class Song {
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

    public String getName() {
        return name;
    }
}
