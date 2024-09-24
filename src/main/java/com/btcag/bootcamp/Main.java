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

        int robotX = 16;
        int robotY = 11;

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


            clear();
            int y = 1;
            //Spielfelderzeugung mit berücksichtigung der Roboterposition; Angabe auf welchen koordinaten sich der Roboter befindet
            while (y < robotY) {
                int x = 1;
                while (x < robotX) {

                    boolean isrobotposition = false;

                    while (x == currentX && y == currentY) {
                        System.out.print("[ X ]");
                        isrobotposition = true;
                        break;
                    }


                    while (!isrobotposition) {
                        System.out.print("[   ]");
                        break;
                    }

                    x++;
                }
                System.out.println();
                y++;
            }
            System.out.println(botname + " ist gerade bei X: " + currentX + " Y: " + currentY + " .\n\n");
            //Abfrage für den nächsten Zug
            System.out.println("Möchtest du neue Koordinaten eingeben? (ja/nein)");
            String answer = scanner.next();
            newcords = answer.equalsIgnoreCase("ja");
        }
    }
}
