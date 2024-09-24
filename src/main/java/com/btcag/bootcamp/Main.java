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

    }
}
