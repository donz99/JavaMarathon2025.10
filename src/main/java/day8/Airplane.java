package day8;

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
        this.weigth=weigth;
    }

    @Override
    public String toString() {
        StringBuilder sb=new StringBuilder();
        return sb.append("Изготовитель: ")
                .append(manufacturer)
                .append(", год выпуска: ")
                .append(year)
                .append(" , длинна: ")
                .append(length)
                .append(", weight: ")
                .append(weigth)
                .append(", amount of fuel in the tank: ")
                .append(fuel)
                .append(".")
                .toString();
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
