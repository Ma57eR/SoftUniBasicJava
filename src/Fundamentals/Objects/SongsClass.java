package Fundamentals.Objects;

import java.util.ArrayList;
import java.util.List;

public class SongsClass {
    List<String> typeList = new ArrayList<>();
    List<String> name = new ArrayList<>();
    List<String> time = new ArrayList<>();

    public List<String> getTypeList() {
        return typeList;
    }

    public void setTypeList(List<String> typeList) {
        typeList.add(String.valueOf(typeList));
    }

    public List<String> getName() {
        return name;
    }

    public void setName(List<String> name) {
        this.name = name;
    }

    public List<String> getTime() {
        return time;
    }

    public void setTime(List<String> time) {
        this.time = time;
    }
}
