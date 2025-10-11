package day4;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        int m = 12;
        int n = 8;
        int sumNumbersInRow;
        int maxAmountPerLine = 0;
        int rowWithMaxSum = 0;
        int[][] array = new int[m][n];

        Random rand = new Random();
        for (int i = 0; i < array.length; i++) {
            sumNumbersInRow=0;
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = rand.nextInt(51);
//                System.out.print(array[i][j] + " ");

                sumNumbersInRow = sumNumbersInRow + array[i][j];
            }
            if (sumNumbersInRow > maxAmountPerLine) {
                maxAmountPerLine = sumNumbersInRow;
                rowWithMaxSum = i;
            }
//            System.out.println();
        }
        System.out.println("The index of the row whose sum of numbers is maximum: " + rowWithMaxSum);


    }
}
