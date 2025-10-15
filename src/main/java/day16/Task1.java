package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) throws IOException {
        File file1 = new File("D:\\Java 2025\\JavaMarathon2021\\src\\main\\resources\\empty.txt");

        printResult(file1);




//        PrintWriter pw = new PrintWriter("D:\\Java 2025\\JavaMarathon2021\\src\\main\\resources\\empty.txt", StandardCharsets.UTF_8);
    }
    public static void  printResult (File file) throws FileNotFoundException {
        Scanner sc = new Scanner(file);
        double arifm = 0;
        int count = 0;
        while (sc.hasNextInt()) {
            arifm = arifm + sc.nextInt();
            count++;
        }
        double xxx=arifm/count;
        System.out.println(xxx);
        double xxx2=Math.round(xxx*10000);
        double xxx3=xxx2/10000;
        System.out.println(xxx3);



    }
}

