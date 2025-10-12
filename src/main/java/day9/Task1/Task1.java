package day9.Task1;

public class Task1 {
    public static void main(String[] args) {
        Student student=new Student("Vasio","HTiT");
        Teacher teacher=new Teacher("Ilona Vasilevna","English");
        System.out.println(student.getGroupName());
        System.out.println(teacher.getSubjectName());
        student.printInfo();
        teacher.printInfo();



    }
}
