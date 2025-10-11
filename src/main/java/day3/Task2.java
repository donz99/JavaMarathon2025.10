package day3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        while (true){
            System.out.print("Enter the dividend and divisor: ");
            double dividend=sc.nextInt();
            double divisor=sc.nextInt();
            if (divisor==0) break;
            System.out.println("Result: "+dividend/divisor);

        }


    }
}
