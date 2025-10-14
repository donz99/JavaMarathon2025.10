package day12.task4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {

        List <String> listMember1=new ArrayList<>();
        listMember1.add("DenisKrasko");
        listMember1.add("DianaKrasko");

        List <String> listMember2=new ArrayList<>();
        listMember2.add("EvaKrasko");
        listMember2.add("MarkKrasko");

        List <String> listMember3=new ArrayList<>();
        listMember3.add("ElenaKrasko");
        listMember3.add("ValKrasko");

        MusicBand mb1=new MusicBand("Skillflex",1993,listMember1);
        MusicBand mb2=new MusicBand("Evaflex",1999,listMember2);
        MusicBand mb3=new MusicBand("ValVortex",1981,listMember3);

        List <MusicBand> listMusicBand1=new ArrayList<>();
        listMusicBand1.add(mb1);
        listMusicBand1.add(mb2);

        List <MusicBand> listMusicBand2=new ArrayList<>();
        listMusicBand2.add(mb3);

        MusicBand.transferMembers(mb1,mb2);

    }
}
