package com.careerdevs.ui;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UserInterface {
    private static Scanner scanner = new Scanner(System.in);

    public static String readStrung(String question) {  //the call is  userInput.readString
        System.out.println(question + "\nInput: ");
        return scanner.nextLine();

    }

    public static int readInt(String question) {
        while (true) {
            try {
                System.out.println(question + "\nNumber:");
                return scanner.nextInt();

            } catch (InputMismatchException e) {
                System.out.println("You must enter a number, please try again.");
                scanner.nextLine();
            }
        }
    }
}