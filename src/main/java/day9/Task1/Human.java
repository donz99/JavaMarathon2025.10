package day9.Task1;

public class Human {
    private String name;

    Human (String name){
        this.name=name;
    }

    public String getName(){
        return this.name;
    }

    void printInfo(){
        System.out.println("Этот человек с именем "+this.name);
    }

}
