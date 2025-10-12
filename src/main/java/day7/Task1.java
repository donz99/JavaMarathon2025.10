package day7;

import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        Airplane airplane1 = new Airplane("Nokia", 1993, 291, 230);
        Airplane airplane2 = new Airplane("Samsung", 1998, 290, 290);
        Airplane.compareAirplanes(airplane1, airplane2);
    }
}