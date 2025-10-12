package day11.task1;

public class Task1 {
    public static void main(String[] args) {
        Warehouse warehouse1 = new Warehouse();
        Worker picker1=new Picker(0,false,warehouse1);
        Worker courier1=new Courier(0,false,warehouse1);

        businessProcess(picker1);
        businessProcess(courier1);

        System.out.println(warehouse1);
        System.out.println(picker1);
        System.out.println(courier1);
        System.out.println();

        Warehouse warehouse2=new Warehouse();
        Worker picker2=new Picker(5,false,warehouse2);
        Worker courier2=new Courier(5,false,warehouse2);
        picker2.doWork();
        courier2.doWork();

        System.out.println(warehouse1);
        System.out.println(picker1);
        System.out.println(courier1);

        System.out.println();

        System.out.println(warehouse2);
        System.out.println(picker2);
        System.out.println(courier2);




    }
    public static void businessProcess (Worker worker){
        for (int i = 0; i < 10_0012; i++) {
            worker.doWork();
        }
        worker.bonus();
    }


}
