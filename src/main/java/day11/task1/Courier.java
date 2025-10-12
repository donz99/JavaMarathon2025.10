package day11.task1;

public class Courier extends Warehouse implements Worker {
    private int salary;
    private boolean isPayed;
    private Warehouse warehouse;

    @Override
    public void doWork() {
        this.salary = this.salary + 100;
        warehouse.setCountDeliveredOrders(warehouse.getCountDeliveredOrders() + 1);
    }

    @Override
    public void bonus() {
        if (isPayed==false) {
            if (warehouse.getCountDeliveredOrders() < 10_000)
                System.out.println("Бонус пока недоступен");
            else {
                this.salary = this.salary + 50_000;
                isPayed = true;
            }
        }
        else System.out.println("Бонус уже выплачен");
    }

    public int getSalary() {
        return this.salary;
    }

    public boolean isPayed() {
        return this.isPayed;
    }

    Courier(int salary, boolean isPayed, Warehouse warehouse) {
        this.salary = salary;
        this.isPayed = isPayed;
        this.warehouse = warehouse;
    }

    public String toString() {
        return "Зарабоная плата этого курьера: " + salary + ", выплачен ли ему бонус: " + isPayed;
    }


}
