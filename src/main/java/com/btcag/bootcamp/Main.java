package com.btcag.bootcamp;

import java.util.Scanner;

import static com.btcag.bootcamp.Clear.clear;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Spielbeginn; Begrüßung mit Spielername; Robotername wird abgefragt
        System.out.println("Bitte gib deinen Spielernamen ein:");
        String playername = scanner.nextLine();
        clear();
        System.out.println("Herzlich Willkommen bei Robot Wars " + playername + " !\n");

        System.out.println("Benenne bitte deinen Roboter:");
        String botname = scanner.nextLine();


        boolean newcords = true;
        //Startkoordinaten werden abgefragt und überprüft
        while (newcords) {
            System.out.println("Bitte gib die X-Koordinate an (1-15):");
            int currentX = scanner.nextInt();
            while (currentX < 1 || currentX > 15) {
                System.out.println("Ungültige Eingabe! Bitte gib eine Zahl zwischen 1-15 an:");
                currentX = scanner.nextInt();
            }

            clear();

            System.out.println("Bitte gib die Y-Koordinate an (1-10):");
            int currentY = scanner.nextInt();
            while (currentY < 1 || currentY > 10) {
                System.out.println("Ungültige Eingabe! Bitte gib eine Zahl zwischen 1-10 an:");
                currentY = scanner.nextInt();
            }

            System.out.println("Möchtest du neue Koordinaten eingeben? (ja/nein)");
            String answer = scanner.next();
            newcords = answer.equalsIgnoreCase("ja");
        }
    }
}
