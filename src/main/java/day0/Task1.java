package day0;


import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        Random random=new Random();
        for (int i = 0; i < 15; i++) {
        int randStamina=random.nextInt(11)+90;
        System.out.println(randStamina);

        }


    }

}