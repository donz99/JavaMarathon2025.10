package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Human {
    private String name;
    private int age;

    Human (String name, int age){
        this.name=name;
        this.age=age;
    }

    public String toString(){
        return this.name+" "+this.age;
    }

    static List<Human> parseFileToObjList (File file) throws FileNotFoundException, DenisException {
        List<Human> sss=new ArrayList<>();
        Scanner sc=new Scanner(file);
        while (sc.hasNextLine()){
            String line=sc.nextLine();
            String[] words=line.split(" ");
            sss.add(new Human(words[0],Integer.parseInt(words[1])));
            if ((Integer.parseInt(words[1]))<0)
                throw new DenisException();
        }
        return sss;

    }
}
