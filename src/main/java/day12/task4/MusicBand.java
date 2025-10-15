package day12.task4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public class MusicBand {
    private String groupName;
    private int year;
    private List<String> groupMember;

    public static void transferMembers(MusicBand musicBand1, MusicBand musicBand2){
        List<String> listGroupMemberAmount=new ArrayList<>();
        System.out.println(listGroupMemberAmount);

        listGroupMemberAmount.addAll(musicBand1.getMembers());
        System.out.println(listGroupMemberAmount);

        listGroupMemberAmount.addAll(musicBand2.getMembers());
        System.out.println(listGroupMemberAmount);

        musicBand2.setGroupMember(listGroupMemberAmount);
        System.out.println(musicBand2);

        musicBand1.setGroupMember(new ArrayList<String>(Collections.emptyList()));
        System.out.println(musicBand1);
    }


    public void setGroupMember(List<String> groupMember) {
        this.groupMember = groupMember;
    }

    public void printMembers(){
        for (String s :groupMember)
            System.out.println(s);
    }

    public List<String> getMembers(){
        return groupMember;
    }

    MusicBand(String name, int year, List<String> groupMember ){
        this.groupName =name;
        this.year=year;
        this.groupMember=groupMember;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "MusicBand{" +
                "groupName='" + groupName + '\'' +
                ", year=" + year +
                ", groupMember=" + groupMember +
                '}';
    }
}
