import java.util.Scanner;

public class Menu {
    Generate generate = new Generate();





    public void startGame() {
        generate.createCarBase();
        generate.createCustomerBase();
        System.out.println("+------------------------------------------------+---------------------------------------------------------+");
        System.out.println("+----------  W E L C O M E   T O  ---------------+           ______--~~~~~~~~~~~~~~~~~~--______            |");
        System.out.println("+------------------------------------------------+      ___ // _-~                        ~-_ \\\\ ___       |");
        System.out.println("| .d888b  .d88888  888 d888 .d888888   888888b.  |     `\\__)\\/~                              ~\\/(__/'      |");
        System.out.println("| 88X     888      8888P'   888  888   888  888  |      _--`-___                            ___-'--_       |");
        System.out.println("| 'Y888b  888      888      888  888   888  888  |    /~     `\\ ~~~~~~~~------------~~~~~~~~ /'     ~\\     |");
        System.out.println("|    X88  888      888      888  888   888  888  |   /|        `\\         ________         /'        |\\    |");
        System.out.println("| ^888P'  'Y88888  888      'Y8888888  888888P'  |  | `\\   ______`\\_      \\------/      _/'______   /' |   |");
        System.out.println("|                                      888       |  |   `\\_~-_____\\ ~-________________-~ /_____-~_/'   |   |");
        System.out.println("| .d8888    .d88888     88 d88         888       |  `.     ~-__________________________________-~     .'   |");
        System.out.println("| 88        88   88     888P'          888       |   `.      [_______/------|~~|------\\_______]      .'    |");
        System.out.println("| 88        88   88     88                       |    `\\--___((____)(________\\/________)(____))___--/'     |");
        System.out.println("| 'Y8888    'Y888888    88         G  A  M  E    |     |>>>>>>||                            ||<<<<<<|      |");
        System.out.println("+------------------------------------------------+---------------------------------------------------------+");
        System.out.println("+>>>>>>>>>>>>>> S E L L   C A R S <<<<<<<<<<<<<<<+>>>>>>>>>>>>>>> O R   D I E    T R Y I N G <<<<<<<<<<<<<<+");
        System.out.println("+------------------------------------------------+---------------------------------------------------------+");
    }

    public void buyAdMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=====================================================================");
        System.out.println("Wybierz opcję: ");
        System.out.println("1 - wykup ogłoszenie w lokalnej gazecie");
        System.out.println("2 - wykup ogłoszenie w internecie");
        System.out.println("0 - wyjście do menu głównego");
        System.out.println("=====================================================================");
        Integer option = scanner.nextInt();
        switch (option) {
            case 0 -> {
                System.out.println("Powrót do menu głównego");
                initialMenu();
            }
            case 1 ->
                    System.out.println("Odwołanie do metody w której po opłacie przybywa losowa ilość potencjalnych kupujących");
            case 2 -> System.out.println("Odwołanie do metody w której po opłacie przybywa JEDEN potencjalny kupujący");
            default -> {
                System.out.println("Błąd: podaj liczbę z zakresu: 0 - 2");
                carsToSoldMenu();
            }
        }
    }

    public void carsToSoldMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=====================================================================");
        System.out.println("Wybierz opcję: ");
        System.out.println("1 - sprzedaj samochód");
        System.out.println("2 - napraw samochód");
        System.out.println("3 - sprawdź historię napraw każdego pojazdu");
        System.out.println("4 - sprawdź historię kosztów napraw i mycia każdego pojazdu");
        System.out.println("0 - wyjście do menu głównego");
        System.out.println("=====================================================================");
        Integer option = scanner.nextInt();
        switch (option) {
            case 0 -> {
                System.out.println("Powrót do menu głównego");
                initialMenu();
            }
            case 1 ->
                    System.out.println("Odwołanie do metody w której po podaniu nr auta sprawdza, czy masz zainteresowanego klienta i dokonuje się sprzedaż");
            case 2 -> {
                System.out.println("Odwołanie do metody 'napraw samochód' z opcją wyboru mechanika");
                Mechanic.printMechanicList();
            }
            case 3 -> System.out.println("Odwołanie do netody wyświetlającej historę napraw każdego pojazdu");
            case 4 ->
                    System.out.println("Odwołanie do netody wyświetlającej historę kosztów napraw i mycia każdego pojazdu");
            default -> {
                System.out.println("Błąd: podaj liczbę z zakresu: 0 - 4");
                carsToSoldMenu();
            }
        }
    }

    public void carsToBuyMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=====================================================================");
        System.out.println("Wybierz opcję: ");
        System.out.println("1 - kup samochód");
        System.out.println("0 - wyjście do menu głównego");
        System.out.println("=====================================================================");
        Integer option = scanner.nextInt();
        switch (option) {
            case 0 -> {
                System.out.println("Powrót do menu głównego");
                initialMenu();
            }
            case 1 ->
                    System.out.println("Odwołanie do metody w której po podaniu nr auta sprawdza, czy masz wystarczające środki i dokonuje się zakup");
            default -> {
                System.out.println("Błąd: podaj liczbę z zakresu: 0 - 1");
                carsToBuyMenu();
            }
        }
    }

    public void initialMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=====================================================================");
        System.out.println("Wybierz opcję: ");
        System.out.println("1 - przeglądaj bazę samochodów do kupienia");
        System.out.println("2 - przeglądaj bazę posiadanych samochodów");
        System.out.println("3 - przejrzyj bazę potencjalnych klientów");
        System.out.println("4 - kup reklamę");
        System.out.println("5 - sprawdź stan konta");
        System.out.println("6 - sprawdź historię transakcji");
        System.out.println("0 - wyjście z programu");
        System.out.println("=====================================================================");
        Integer option = scanner.nextInt();
        switch (option) {
            case 0 -> System.out.println("Program został wyłączony w trakcie gry");
            case 1 -> {
                System.out.println("OTO LISTA SAMOCHODÓW DO KUPIENIA: ");
                generate.showCarBase();
                carsToBuyMenu();
            }
            case 2 -> {
                System.out.println("Odwołanie do metody 'przejrzyj bazę posiadanych samochodów' w klasie player");
                Player.showPlayerGarage();
                Mechanic.addMechanic();
                carsToSoldMenu();
            }
            case 3 -> {
                System.out.println("OTO BAZA POTENCJALNYCH KLIENTÓW: ");
                generate.showCustomerBase();
            }
            case 4 -> {
                System.out.println("Odwołanie do metody 'kup reklamę' z opcjami");
                buyAdMenu();
            }
            case 5 -> {
                System.out.println("Odwołanie do metody 'sprawdzStanKonta' w klasie player");
                Player.showPlayerCash();
                initialMenu();
            }
            case 6 -> {
                Player.showTransactionHistory();
                initialMenu();
            }
            default -> {
                System.out.println("Błąd: podaj liczbę z zakresu: 0 - 6");
                initialMenu();
            }
        }
    }



    /*
                System.out.println("2 - kup samochód");
                System.out.println("4 - napraw samochód");
                System.out.println("6 - sprzedaj samochód za określoną cenę potencjalnemu klientowi ");
                        System.out.println("7 - sprawdź historię napraw każdego pojazdu");
            System.out.println("8 - sprawdź sumę kosztów napraw i mycia dla każdego z posiadanych pojazdów");
    */


}


