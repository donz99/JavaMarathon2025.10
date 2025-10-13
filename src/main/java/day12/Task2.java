package day12;

import java.util.ArrayList;
import java.util.List;

public class Task2 {

    public static void main(String[] args) {
        List<Integer> list1=new ArrayList();
        meth1(0,30,list1);
        meth1(300,350,list1);
        System.out.println(list1);
    }

    public static void meth1(int number1, int number2,List list){
        for (int i = number1; i < number2+1; i++) {
            if (i%2!=1&&i!=0)
            list.add(i);
        }

    }
}
