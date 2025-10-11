package day4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arrayLength = sc.nextInt();

        Random rand = new Random();
        int[] array = new int[arrayLength];

        for (int x = 0; x < array.length; x++)
            array[x] = rand.nextInt(11);

        System.out.println(Arrays.toString(array));

        System.out.println("Длина массива " + array.length);

        int counterMore8 = 0;
        int counterZero = 0;
        int counterEven = 0;
        int counterOdd = 0;
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
            if (array[i] > 8) counterMore8++;
            if (array[i] == 1) counterZero++;
            if (array[i] % 2 == 0 && array[i] != 0) counterEven++;
            if (array[i] % 2 == 1) counterOdd++;
        }
        System.out.println("Количество чисел больше 8: " + counterMore8);
        System.out.println("Количество чисел равных 1: " + counterZero);
        System.out.println("Количество четных чисел: " + counterEven);
        System.out.println("Количество нечетных чисел: " + counterOdd);
        System.out.println("Сумма всех элементов массива: " + sum);


    }
}
