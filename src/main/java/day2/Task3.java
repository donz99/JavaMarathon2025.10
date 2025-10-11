package day2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int b = sc.nextInt();
        if (i > b) System.out.println("Incorrect input");
        int t = i + 1;

        while (t < b) {
            if (t % 5 == 0 && t % 10 != 0)
                System.out.println(t);
            t++;
        }


    }
}
