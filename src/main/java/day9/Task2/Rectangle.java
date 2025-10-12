package day9.Task2;

public class Rectangle extends Figure {
    private int width;
    private int height;

    Rectangle(String color, int width, int height){
        super(color);
        this.width=width;
        this.height=height;
    }

    @Override
    public double area() {
        return width*height;
    }

    @Override
    public double perimeter() {
        return (width+height)*2;
    }

}
