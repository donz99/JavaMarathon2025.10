package day6;

import java.util.Random;

public class Teacher {
    private String name;
    private String subject;
    Random random=new Random();

    public void evaluate(Student student){
        int randomNumber=random.nextInt(4)+2;
        String grade="";
        switch (randomNumber){
        case 2: grade="D";
                break;
        case 3: grade="C";
        break;
        case 4: grade="B";
        break;
        case 5: grade="A";
                break;}
        System.out.printf("Teacher %s rated student %s in subject %s with the grade %s", this.name, student.getName(), this.subject, grade );
    }

    Teacher(String name, String subject){
        this.name=name;
        this.subject=subject;}

    public String getName(){return this.name;}
    public String getSubject(){return this.subject;}
    public void setName(String name){this.name=name;}
    public  void setSubject(String subject){this.subject=subject;}
}
