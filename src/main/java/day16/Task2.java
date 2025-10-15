package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) throws FileNotFoundException {
        Random random = new Random();
        PrintWriter pw1 = new PrintWriter("src\\main\\resources\\file1.txt");
        for (int i = 0; i < 1_000; i++) {
            pw1.print(random.nextInt(101) + "\n");
        }
        pw1.close();
        File file5 = new File("src\\main\\resources\\file1.txt");
        Scanner sc = new Scanner(file5);
        PrintWriter pw2 = new PrintWriter("src\\main\\resources\\file2.txt");
        for (int i = 0; i < 50; i++) {
            double arifm1 = 0;
            for (int j = 0; j < 20; j++) {
                arifm1 = arifm1 + sc.nextInt();
            }
            pw2.println(arifm1 / 20);
        }
        pw2.close();
        File file6 = new File("src\\main\\resources\\file2.txt");
        printResult(file6);
    }
    public static void  printResult(File file) throws FileNotFoundException {
        double sum=0;
        Scanner sc = new Scanner(file);
        while (sc.hasNextLine()){
            sum=sum+(Double.parseDouble(sc.nextLine()));
        }
        System.out.println(Math.round(sum));
    }
}
