package day13;

import java.util.Date;

public class Task1 {
    public static void main(String[] args) {
        Date date1 = new Date();
        System.out.println(date1);

        Date date2=new Date(12121212);
        System.out.println(date2);

        User user1=new User("Denis");
        User user2=new User("Diana");
        User user3=new User("Eva");

        user1.sendMassage(user2,"Привет!");
        user1.sendMassage(user2,"Как дела?");

        user2.sendMassage(user1,"Привет)");
        user2.sendMassage(user1,"Всё отлично!");
        user2.sendMassage(user1,"Как у тебя?)");

        user3.sendMassage(user1,"Привет!!!");
        user3.sendMassage(user1,"Опа");
        user3.sendMassage(user1,"И вот так");

        user1.sendMassage(user3,"Эй не говри ерунды");
        user1.sendMassage(user3,"А то");
        user1.sendMassage(user3,"Надоел");

        user3.sendMassage(user1,"Пока");

        MessageDataBase.showDialog(user1,user3);
//        MessageDataBase.printFirstMessage();



    }
}
