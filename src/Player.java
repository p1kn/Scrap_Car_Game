import java.util.ArrayList;

public class Player {

    public String playerName;
    public Double playerInitialCash;
    public Double playerCash;
    public ArrayList<String> transactionHistory = new ArrayList<>();
    public ArrayList<Vehicle> playerGarage = new ArrayList<>();
    public int moveCounter;

    public Player(String playersName, Double playerInitialCash) {
        this.playerName = playersName;
        this.playerInitialCash = playerInitialCash;
        this.playerCash = playerCash;
        this.moveCounter = 0;
    }

    public static void showPlayerCash(){
        System.out.println("Wyświetla: stan konta gracza...");
    }

    public static void showPlayerGarage(){
        System.out.println("Wyświetla: Lista samochodów gracza...");
    }

    public static void showTransactionHistory(){
        System.out.println("Wyświetla: Historia transakcji");
    }

}
