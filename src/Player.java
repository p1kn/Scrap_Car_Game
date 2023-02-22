import java.util.ArrayList;

public class Player {

    public String playersName;
    public Double playersCash;
    public ArrayList<String> transactionHistory = new ArrayList<>();
    public ArrayList<String> playersGarage = new ArrayList<>();
    public int moveCounter;

    public Player(String playersName, Double playersCash) {
        this.playersName = playersName;
        this.playersCash = playersCash;
        this.moveCounter = 0;
    }

    public static void showPlayersCash(){
        System.out.println("Wyświetla: stan konta gracza...");
    }

    public static void showPlayersGarage(){
        System.out.println("Wyświetla: Lista samochodów gracza...");
    }

    public static void showTransactionHistory(){
        System.out.println("Wyświetla: Historia transakcji");
    }

}
