package day12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<String> list1=new ArrayList<>();
        list1= new ArrayList<>(Arrays.asList("BMW","Mersedes","Audi","Wolk","Reno"));
        System.out.println(list1);
        list1.add("MAZ");
        System.out.println(list1);
        list1.add(2,"Geely");
        System.out.println(list1);
        list1.remove(0);
        System.out.println(list1);

    }
}
