package day5;

public class Motorbyke {
    private String model;
    private String color;
    private int year;

    Motorbyke(String model, String color, int year){
        this.model=model;
        this.color=color;
        this.year=year;
    }

    public String getModel(){
        return this.model;
    }
    public String getColor(){
        return color;
    }
    public int getYear(){return year;}


}
