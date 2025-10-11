package day6;

public class Car {
    private String model;
    private String color;
    private int year;

    public void setModel(String model){
        this.model=model;
    }
    public void setColor(String color){
        this.color=color;
    }
    public void setYear(int year){
        this.year=year;
    }

    public String getModel(){
        return model;
    }
    public String getColor(){
        return this.color;
    }
    public int getYear(){
        return year;
    }

    public void info(){
        System.out.println("Это автомобиль");
    }
    public int yearDifference(int inputYear){
        if (inputYear-year>0) return inputYear-year;
        else if(inputYear-year<0) return  year-inputYear;
        else return 0;
    }


}
