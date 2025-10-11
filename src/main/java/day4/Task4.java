package day4;

import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        int[] array=new int[100];
        Random rand=new Random();
        int max=Integer.MIN_VALUE;
        int sum3elem=0;
        int index=0;
        for (int i = 0; i < array.length; i++) {
            array[i]=rand.nextInt(10_001);
        }
        for (int i = 0; i < array.length-2; i++) {
            sum3elem=array[i]+array[i+1]+array[i+2];
            if (sum3elem>max) {
                max = sum3elem;
                index =i;
            }
        }
        System.out.println("Значение суммы тройки элементов: " +max);
        System.out.println("Индекс первого элемента троки: " +index);




    }
}
