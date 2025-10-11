package day6;

public class Task3 {
    public static void main(String[] args) {
        Airplane airplane=new Airplane("nokia",1252,255,21);
        Car car=new Car();
        Motorbyke motorbyke=new Motorbyke("ass","red",1234);
        Student student=new Student("Vasio");
        Teacher teacher=new Teacher("Irina Serg","Informatika");
        teacher.evaluate(student);

    }
}
