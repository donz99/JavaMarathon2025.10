package day7;

public class Player {
    private int stamina;
    static final int MAX_STAMINA = 100;
    static final int MIN_STAMINA = 0;
    private static int countPlayers;

    Player(int stamina) {
        this.stamina = stamina;
        countPlayers++;
    }

    public int getStamina() {
        return this.stamina;
    }

    public static int getCountPlayers() {
        return countPlayers;
    }

    public void run() {
        stamina--;
        if (stamina == 0) {
            countPlayers--;
        }
    }

    public static void info() {
        System.out.printf("\nКоличество игроков на поле: %d. ", countPlayers);

        if (countPlayers <6) {
            switch (countPlayers) {
                case 0:
                case 1:
                    System.out.printf("Команды неполные. На поле ещё есть %d свободных мест.", 6 - countPlayers);
                    break;
                case 2:
                case 3:
                case 4:
                    System.out.printf("Команды неполные. На поле ещё есть %d свободных места.", 6 - countPlayers);
                    break;
                case 5:
                    System.out.printf("Команды неполные. На поле ещё есть %d свободное место.", 6 - countPlayers);
                    break;
            }
        } else System.out.println("На поле больше нет свободных мест.");
    }
}
