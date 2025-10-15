package day12.task5;

import day12.task5.MusicBand2;

import java.util.ArrayList;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {
        List<MusicArtist> musicArtists1=new ArrayList<>();
        musicArtists1.add(new MusicArtist("DenisKrasko",18));
        musicArtists1.add(new MusicArtist("DianaKrasko",16));

        List <MusicArtist> musicArtists2=new ArrayList<>();
        musicArtists2.add(new MusicArtist("EvaKrasko",5));
        musicArtists2.add(new MusicArtist("MarkKrasko",6));

        List <MusicArtist> musicArtists3=new ArrayList<>();
        musicArtists3.add(new MusicArtist("ElenaKrasko",45));
        musicArtists3.add(new MusicArtist("ValKrasko",51));



        MusicBand2 mb1=new MusicBand2("Skillflex",1993,musicArtists1);
        MusicBand2 mb2=new MusicBand2("Evaflex",1999,musicArtists2);
        MusicBand2 mb3=new MusicBand2("ValVortex",1981,musicArtists3);

        List <MusicBand2> listMusicBand1=new ArrayList<>();
        listMusicBand1.add(mb1);
        listMusicBand1.add(mb2);

        List <MusicBand2> listMusicBand2=new ArrayList<>();
        listMusicBand2.add(mb3);

        MusicBand2.transferMembers(mb1,mb2);
        mb3.printMembers();
        System.out.println(mb3.getMembers());

    }
}
