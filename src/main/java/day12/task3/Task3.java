package day12.task3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        MusicBand mb1=new MusicBand("HolyDayBoy",1990);
        MusicBand mb2=new MusicBand("Marsianin",1997);
        MusicBand mb3=new MusicBand("SecondtoMars",1999);
        MusicBand mb4=new MusicBand("Agutin",1995);
        MusicBand mb5=new MusicBand("Mia",1992);
        MusicBand mb6=new MusicBand("Gaga",2001);
        MusicBand mb7=new MusicBand("RollsRoys",2005);
        MusicBand mb8=new MusicBand("Mamamia",2007);
        MusicBand mb9=new MusicBand("Roling",2002);
        MusicBand mb10=new MusicBand("BadStreet",2001);
        MusicBand mb11=new MusicBand("BritneySpears",2000);

        List<MusicBand> listMB=new ArrayList<>(Arrays.asList(mb1,mb2,mb3,mb4,mb5,mb6,mb7,mb8,mb9,mb10,mb11));
        System.out.println(listMB);
        Collections.shuffle(listMB);
        System.out.println(listMB);
        List<MusicBand> listAfter2000=groupsAfter2000(listMB);
        System.out.println(listAfter2000);

    }

    public static List<MusicBand> groupsAfter2000(List<MusicBand> bands){
        List<MusicBand> after2000=new ArrayList<>();
        for(MusicBand musicBand:bands){
            if (musicBand.getYear()>2000)
                after2000.add(musicBand);
        }

        return after2000;


    }
}
