package day12.task5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MusicBand2 {
    private String groupName;
    private int groupYear;
    private List<MusicArtist> musicArtists;

    public static void transferMembers(MusicBand2 musicBand1, MusicBand2 musicBand2){
        List<MusicArtist> listGroupMemberAmount=new ArrayList<>();
        System.out.println(listGroupMemberAmount);

        listGroupMemberAmount.addAll(musicBand1.getMusicArtists());
        System.out.println(listGroupMemberAmount);

        listGroupMemberAmount.addAll(musicBand2.getMusicArtists());
        System.out.println(listGroupMemberAmount);

        musicBand2.setMusicArtists(listGroupMemberAmount);
        System.out.println(musicBand2);

        musicBand1.setMusicArtists(new ArrayList<MusicArtist>(Collections.emptyList()));
        System.out.println(musicBand1);
    }

       public void printMembers(){
        System.out.println(musicArtists);
    }

    public List<MusicArtist> getMembers(){
        return musicArtists;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public int getGroupYear() {
        return groupYear;
    }

    public void setGroupYear(int groupYear) {
        this.groupYear = groupYear;
    }

    public List<MusicArtist> getMusicArtists() {
        return musicArtists;
    }

    public void setMusicArtists(List<MusicArtist> musicArtists) {
        this.musicArtists = musicArtists;
    }

    public MusicBand2(String groupName, int groupYear, List<MusicArtist> musicArtists) {
        this.groupName = groupName;
        this.groupYear = groupYear;
        this.musicArtists = musicArtists;
    }

    @Override
    public String toString() {
        return "Музыкальная группа: " +
                "'" + groupName + '\'' +
                ", год группы: " + groupYear +
                ", артисты в группе: " + musicArtists +
                '}';
    }
}
