package day7;

public class Airplane {
    private String manufacturer;
    private int year;
    private int length;
    private int weigth;
    private int fuel;

    Airplane(String manufacturer, int year, int length, int weigth){
        this.fuel=0;
        this.manufacturer=manufacturer;
        this.year=year;
        this.length=length;
        this.weigth=weigth;}

    static public void compareAirplanes(Airplane airplane1, Airplane airplane2){
        if (airplane1.length>airplane2.length) System.out.println("More length airplane: "+airplane1.manufacturer+airplane1.year);
        else if (airplane1.length<airplane2.length) System.out.println("More length airplane: "+airplane2.manufacturer+airplane2.year);
    }

    public void info(){ System.out.printf("Изготвитель: %s, год выпуска: %d, длина: %d, weight: %d,amount of fuel in the tank: %d",
                manufacturer, year, length, weigth, fuel);}

    public void fillUp(int n){ this.fuel=n;}

    public int getFuel(){return fuel;}
    public void setManufacturer(String manufacturer){this.manufacturer=manufacturer;}
    public void setYear (int year){this.year=year;}
    public void setLength(int length){this.length=length;}
    public void setWeigth(int weigth){this.weigth=weigth;}
    public void setFuel(int fuel){this.fuel=fuel;}
}
