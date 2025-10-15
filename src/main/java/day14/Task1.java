package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        String separator=File.separator;
        String path = separator+ "d:"+separator+ "sssss.txt";

        File file1 = new File(path);
        printSumDigits(file1);

    }

    static void printSumDigits(File file){
        int sum=0;
        Scanner scanner = null;
        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
            throw new RuntimeException(e);
        }

        int i=0;
        List<Integer> numbers=new ArrayList<>();
        while (scanner.hasNextInt()){
            numbers.add(scanner.nextInt());
            i++;
        }
        if (numbers.size()!=10){
            System.out.println("Некорректный входной файл");
            throw new RuntimeException();}

        for (Integer i2:numbers){
            sum=sum+i2;
            System.out.println(sum);
        }
        scanner.close();

    }
}
