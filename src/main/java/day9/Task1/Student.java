package day9.Task1;

public class Student extends Human{
    private String groupName;

    public String getGroupName() {
        return this.groupName;
    }

        public Student (String name, String groupName){
            super(name);
            this.groupName=groupName;
        }
        void printInfo(){
        super.printInfo();
            System.out.println("Этот студент с именем "+this.getName());
        }
}
