package day8;

public class Task1 {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder();
        String s1="";

        long startTime1=System.currentTimeMillis();
        for (int i = 0; i < 20_000; i++) {
            sb.append(i).append(" ");
        }
        long stopTime1=System.currentTimeMillis();
        System.out.println(sb.toString());
        System.out.println(stopTime1-startTime1);
        long startTime2=System.currentTimeMillis();
        for (int i = 0; i < 20_000; i++) {
            s1=s1+i+" ";
        }
        long stopTime2=System.currentTimeMillis();
        System.out.println(s1);
        System.out.println(stopTime2-startTime2);


    }
}
