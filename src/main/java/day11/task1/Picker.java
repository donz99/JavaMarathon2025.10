package day11.task1;

public class Picker extends Warehouse implements Worker{
    private int salary;
    private boolean isPayed;
    private Warehouse warehouse;

    @Override
    public void doWork() {
        this.salary=this.salary+80;
        warehouse.setCountPickOrders(warehouse.getCountPickOrders()+1);
    }


    @Override
    public void bonus() {
        if (isPayed==false) {
            if (warehouse.getCountPickOrders() < 10_000)
                System.out.println("Бонус пока недоступен");
            else {
                this.salary = this.salary + 70_000;
                isPayed = true;
            }
        }
        else System.out.println("Бонус уже выплачен");
    }

    public int getSalary(){return this.salary;}

    public boolean getIsPayed(){return this.isPayed;}

    Picker(int salary, boolean isPayed, Warehouse warehouse){
        this.salary=salary;
        this.isPayed=isPayed;
        this.warehouse=warehouse;
    }
    public String toString(){
        return "Заработная плата этого сборщика: "+salary+", и был ли выплачен ему бонус: "+isPayed;
    }

}
