package day9.Task1;

public class Teacher extends Human{
    private String subjectName;

    public String getSubjectName() {
        return subjectName;
    }

    Teacher (String name, String subjectName){
        super(name);
        this.subjectName=subjectName;
    }

    @Override
    void printInfo() {
        super.printInfo();
        System.out.println("Этот преподаватель с именем "+this.getName());
    }
}
