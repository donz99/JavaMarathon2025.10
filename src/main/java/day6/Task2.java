package day6;

public class Task2 {
    public static void main(String[] args) {

        Airplane airp1=new Airplane("NASA",1995,155,10820);
        airp1.setYear(1999);
        airp1.setLength(200);
        airp1.fillUp(5);
        airp1.fillUp(12);
        airp1.info();

    }
}
