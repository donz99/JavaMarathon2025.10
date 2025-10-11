package day2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int floor=sc.nextInt();
        if (floor>0&&floor<5) System.out.println("Малоэтажный дом");
        if (floor>4&&floor<9) System.out.println("Среднеэтажный дом");
        if (floor>8) System.out.println("Многоэтажный дом");
        if (floor<0) System.out.println("Ошибка ввода");
    }
}
