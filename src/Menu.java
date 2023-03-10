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
        System.out.println("Wybierz opcj??: ");
        System.out.println("1 - wykup og??oszenie w lokalnej gazecie");
        System.out.println("2 - wykup og??oszenie w internecie");
        System.out.println("0 - wyj??cie do menu g????wnego");
        System.out.println("=====================================================================");
        Integer option = scanner.nextInt();
        switch (option) {
            case 0 -> {
                System.out.println("Powr??t do menu g????wnego");
                initialMenu();
            }
            case 1 ->
                    System.out.println("Odwo??anie do metody w kt??rej po op??acie przybywa losowa ilo???? potencjalnych kupuj??cych");
            case 2 -> System.out.println("Odwo??anie do metody w kt??rej po op??acie przybywa JEDEN potencjalny kupuj??cy");
            default -> {
                System.out.println("B????d: podaj liczb?? z zakresu: 0 - 2");
                carsToSoldMenu();
            }
        }
    }

    public void carsToSoldMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=====================================================================");
        System.out.println("Wybierz opcj??: ");
        System.out.println("1 - sprzedaj samoch??d");
        System.out.println("2 - napraw samoch??d");
        System.out.println("3 - sprawd?? histori?? napraw ka??dego pojazdu");
        System.out.println("4 - sprawd?? histori?? koszt??w napraw i mycia ka??dego pojazdu");
        System.out.println("0 - wyj??cie do menu g????wnego");
        System.out.println("=====================================================================");
        Integer option = scanner.nextInt();
        switch (option) {
            case 0 -> {
                System.out.println("Powr??t do menu g????wnego");
                initialMenu();
            }
            case 1 ->
                    System.out.println("Odwo??anie do metody w kt??rej po podaniu nr auta sprawdza, czy masz zainteresowanego klienta i dokonuje si?? sprzeda??");
            case 2 -> {
                System.out.println("Odwo??anie do metody 'napraw samoch??d' z opcj?? wyboru mechanika");
                Mechanic.printMechanicList();
            }
            case 3 -> System.out.println("Odwo??anie do netody wy??wietlaj??cej histor?? napraw ka??dego pojazdu");
            case 4 ->
                    System.out.println("Odwo??anie do netody wy??wietlaj??cej histor?? koszt??w napraw i mycia ka??dego pojazdu");
            default -> {
                System.out.println("B????d: podaj liczb?? z zakresu: 0 - 4");
                carsToSoldMenu();
            }
        }
    }

    public void carsToBuyMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=====================================================================");
        System.out.println("Wybierz opcj??: ");
        System.out.println("1 - kup samoch??d");
        System.out.println("0 - wyj??cie do menu g????wnego");
        System.out.println("=====================================================================");
        Integer option = scanner.nextInt();
        switch (option) {
            case 0 -> {
                System.out.println("Powr??t do menu g????wnego");
                initialMenu();
            }
            case 1 ->
                    System.out.println("Odwo??anie do metody w kt??rej po podaniu nr auta sprawdza, czy masz wystarczaj??ce ??rodki i dokonuje si?? zakup");
            default -> {
                System.out.println("B????d: podaj liczb?? z zakresu: 0 - 1");
                carsToBuyMenu();
            }
        }
    }

    public void initialMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=====================================================================");
        System.out.println("Wybierz opcj??: ");
        System.out.println("1 - przegl??daj baz?? samochod??w do kupienia");
        System.out.println("2 - przegl??daj baz?? posiadanych samochod??w");
        System.out.println("3 - przejrzyj baz?? potencjalnych klient??w");
        System.out.println("4 - kup reklam??");
        System.out.println("5 - sprawd?? stan konta");
        System.out.println("6 - sprawd?? histori?? transakcji");
        System.out.println("0 - wyj??cie z programu");
        System.out.println("=====================================================================");
        Integer option = scanner.nextInt();
        switch (option) {
            case 0 -> System.out.println("Program zosta?? wy????czony w trakcie gry");
            case 1 -> {
                System.out.println("OTO LISTA SAMOCHOD??W DO KUPIENIA: ");
                generate.showCarBase();
                carsToBuyMenu();
            }
            case 2 -> {
                System.out.println("Odwo??anie do metody 'przejrzyj baz?? posiadanych samochod??w' w klasie player");
                Player.showPlayerGarage();
                Mechanic.addMechanic();
                carsToSoldMenu();
            }
            case 3 -> {
                System.out.println("OTO BAZA POTENCJALNYCH KLIENT??W: ");
                generate.showCustomerBase();
            }
            case 4 -> {
                System.out.println("Odwo??anie do metody 'kup reklam??' z opcjami");
                buyAdMenu();
            }
            case 5 -> {
                System.out.println("Odwo??anie do metody 'sprawdzStanKonta' w klasie player");
                Player.showPlayerCash();
                initialMenu();
            }
            case 6 -> {
                Player.showTransactionHistory();
                initialMenu();
            }
            default -> {
                System.out.println("B????d: podaj liczb?? z zakresu: 0 - 6");
                initialMenu();
            }
        }
    }



    /*
                System.out.println("2 - kup samoch??d");
                System.out.println("4 - napraw samoch??d");
                System.out.println("6 - sprzedaj samoch??d za okre??lon?? cen?? potencjalnemu klientowi ");
                        System.out.println("7 - sprawd?? histori?? napraw ka??dego pojazdu");
            System.out.println("8 - sprawd?? sum?? koszt??w napraw i mycia dla ka??dego z posiadanych pojazd??w");
    */


}


