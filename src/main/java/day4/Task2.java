package day4;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random rand=new Random();
        int[] array=new int[100];
        for (int i = 0; i < 100; i++) {
            array[i]= rand.nextInt(10_001);
        }
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        int counter0=0;
        int sum=0;
        for (int x:array){
            sum+=x;
            if (x>max) max=x;
            if (x<min) min=x;
            if (x%10==0&&x!=0){
                sum=sum+x;
                counter0++;
            }
            System.out.print(x+ " ");
        }
        System.out.println();
        System.out.println("Набиольш элемент массива: "+max);
        System.out.println("min элемент массива: "+min);
        System.out.println("counter0: "+counter0);
        System.out.println("Сумма элементов массива, оканчивающихся на 0: "+sum);

    }
}
