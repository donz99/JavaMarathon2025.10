package day6;

public class Task1 {
    public static void main(String[] args) {
        Car car1=new Car();
        car1.setColor("green");
        car1.setModel("s7");
        car1.setYear(1987);
        Motorbyke mt1=new Motorbyke("s1","red",1993);
        car1.yearDifference(2010);
        mt1.yearDifference(2011);
        car1.info();
        mt1.info();


    }
}
