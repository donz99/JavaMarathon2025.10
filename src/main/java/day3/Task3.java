package day3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            double a= sc.nextInt();
            double b= sc.nextInt();
            if (b==0) {
                System.out.println("Деление на 0");
                continue;
            }
            System.out.println(a/b);

        }


    }
}
