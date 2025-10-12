package day11.task1;

public class Warehouse {
    private int countPickOrders;
    private int countDeliveredOrders;


    public int getCountPickOrders() {return countPickOrders;}

    public int getCountDeliveredOrders() {return countDeliveredOrders;}

    public void setCountPickOrders(int countPickOrders) {
        this.countPickOrders = countPickOrders;
    }

    public void setCountDeliveredOrders(int countDeliveredOrders) {
        this.countDeliveredOrders = countDeliveredOrders;
    }

//    Warehouse(int countPickOrders, int countDeliveredOrders){
//        this.countPickOrders=countPickOrders;
//        this.countDeliveredOrders=countDeliveredOrders;
//    }

    @Override
    public String toString() {return "Количество собранных заказов: " + countPickOrders + ", а количество доставлнных заказов: " + countDeliveredOrders + ".";}

}
