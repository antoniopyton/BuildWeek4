package buildWeek;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Benvenuto, quanti biglietti desideri acquistare?");
        Integer biglietti = scanner.nextInt();
        System.out.println("Da dove parti?");
//
        System.out.println("-Napoli \n-Roma \n-Firenze \n-Frosinone \n-Milano");
        String inizio = scanner.nextLine();
        scanner.nextLine();
        System.out.println("Hai scelto di partire da: " + inizio + "dove vuoi andare?");
        System.out.println("-Venezia \n-Bologna \n-Torino \n-Palermo \n-Bari");
        String arrivo = scanner.nextLine();
        System.out.println("Stai acquistando " + biglietti + " biglietti per un viaggio da " + inizio + "Arrivo a " + arrivo);






    }

}
