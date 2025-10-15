package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task2 {
    public static void main(String[] args) throws FileNotFoundException {
        List <String> list1=  parseFileToStringList(new File("test2.txt"));
//        for (String s1:list1){
//            System.out.println(s1);
//        }
    }

    public static List<String> parseFileToStringList (File file) throws FileNotFoundException {
        List<String> list1=new ArrayList<>();
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()){
                list1.add(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
            throw new FileNotFoundException("Файл не найден");
        }

        try {
            for (String s : list1) {
                Pattern pattern = Pattern.compile("[+-]?\\d+");
                Matcher matcher = pattern.matcher(s);
                while (matcher.find()) {
                    if (Integer.parseInt(matcher.group()) < 0) {
                        throw new DenisException("");
                    }
                }
            }
        } catch (DenisException e){
            e.printStackTrace();
            System.out.println("Некорректный входной файл");
            list1=null;
        }
        return list1;
    }
}
