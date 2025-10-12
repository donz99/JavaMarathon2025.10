package day9.Task2;

public class Triangle extends Figure {
    private int lenth1;
    private int lenth2;
    private int lenth3;

    Triangle(String color, int lenth1, int lenth2, int lenth3){
        super(color);
        this.lenth1=lenth1;
        this.lenth2=lenth2;
        this.lenth3=lenth3;
    }

    @Override
    public double area() {
        int p=(lenth1+lenth2+lenth3)/2;
        return Math.pow(p*(p-lenth1)*(p-lenth2)*(p-lenth3),1.0/2);
    }

    @Override
    public double perimeter() {
        return lenth1+lenth2+lenth2;
    }
}
