package day12.task5;

import java.util.List;

public class MusicBand {
    private String name;
    private int year;
    private List<MusicArtist> member;

    public MusicBand(String name, int year, List<MusicArtist> member) {
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
        for (MusicArtist musicArtist : member) {
            System.out.println(musicArtist.getName());
        }
    }
    public List<MusicArtist> getMembers() {
        return member;
    }
}
