package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) throws FileNotFoundException, DenisException {
//        Human.parseFileToObjList(new File("test2.txt"));
        try {
            System.out.println(Human.parseFileToObjList(new File("test2.txt")));
        } catch (DenisException e){
            throw new DenisException("Некорректный входной файл");
        } catch (FileNotFoundException e) {
            throw new FileNotFoundException("Файл не найден");
        }


    }
}
