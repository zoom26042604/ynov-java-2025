package fr.ynov.java.medium;

import java.util.Scanner;

public class Square {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        System.out.println("Square of " + num + " is: " + square(num));

        scanner.close();
    }

    public static double square(int num) {
        return num * num;
    }
}