package day12.task4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MusicBand {
    private String name;
    private int year;
    private List<String> member;

    public MusicBand(String name, int year, List<String> member) {
        this.name = name;
        this.year = year;
        this.member = member;
    }
    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public static void transferMembers(MusicBand source, MusicBand dest) {
        for (int i = 0; i < source.getMembers().size(); i++) {
            dest.getMembers().add(source.getMembers().get(i));
        }
        source.getMembers().clear();

    }
    public void printMembers() {
        System.out.println(member);
    }
    public List<String> getMembers() {
        return member;
    }
}
