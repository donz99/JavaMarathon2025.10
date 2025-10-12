package day7;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random random=new Random();
        Player.info();
        Player[] player=new Player[10];
        for (int i = 0; i < 10; i++) {
            if (Player.getCountPlayers()<6){
            int randStamina=random.nextInt((Player.MAX_STAMINA-90)+1)+90;
            player[i]=new Player(randStamina);
            Player.info();}
        }

        System.out.printf("Выносливость игрока равна %d\n", player[0].getStamina());
        while (true){
            player[0].run();
            System.out.printf("Выносливость игрока равна %d. ", player[0].getStamina());
            if (player[0].getStamina()==Player.MIN_STAMINA){
                System.out.print("\nИгрок потерял всю выносливость. Игрок покидает игровое поле.");
                break;}
        }
        player[0].run();
        Player.info();

    }
}
