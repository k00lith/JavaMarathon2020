package day12.task3;

import javax.naming.PartialResultException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        MusicBand metallica = new MusicBand("Metallica", 1985);
        MusicBand queen = new MusicBand("Queen", 1989);
        MusicBand nirvana = new MusicBand("Nirvana", 1989);
        MusicBand prodigy = new MusicBand("Prodigy", 1990);
        MusicBand beatles = new MusicBand("Beatles", 1972);
        MusicBand band1 = new MusicBand("Band1", 2001);
        MusicBand band2 = new MusicBand("Band2", 2002);
        MusicBand band3 = new MusicBand("Band3", 2003);
        MusicBand band4 = new MusicBand("Band4", 2004);
        MusicBand band5 = new MusicBand("Band5", 2005);

        List<MusicBand> list = Arrays.asList(metallica, queen, nirvana, prodigy,
                                                beatles, band1, band2, band3, band4, band5);
        System.out.println("Before shuffle:");
        for (MusicBand musicBand : list) {
            System.out.println(musicBand.getName());
        }
        Collections.shuffle(list);
        System.out.println("After shuffle (original):");
        for (MusicBand musicBand : list) {
            System.out.println(musicBand.getName());
        }
        List<MusicBand> list1 = groupsAfter2000(list);
        System.out.println("After sort by year:");
        for (MusicBand musicBand : list1) {
            System.out.println(musicBand.getName());
        }
    }
    public static List<MusicBand> groupsAfter2000(List<MusicBand> bands) {
        List<MusicBand> list = new ArrayList<>(10);
        for (MusicBand band : bands) {
            if (band.getYear() > 2000) {
                list.add(band);
            }
        }
        return list;
    }
}
