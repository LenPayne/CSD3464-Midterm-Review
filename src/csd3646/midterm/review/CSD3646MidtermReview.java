/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csd3646.midterm.review;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author c0587637
 */
public class CSD3646MidtermReview {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // Declaring Variables
        double unitPrice;
        int unitQuantity;

        // Assigning Values
        unitPrice = 10.1;
        unitQuantity = 87;

        // Mathematics and Assignment
        double totalPrice = unitPrice * unitQuantity;

        // Formatting using String.format
        String priceString = String.format("$%.2f", totalPrice);
        System.out.printf("Total: %-10s\n", priceString);

        // Formatting using printf
        System.out.printf("Total: $%-10.2f\n", totalPrice);

        // Output the numbers from 1-100. Output them in rows of 10.
        // eg- 1 2 3 4 5 6 7 8 9 10
        //     11 12 13 14...
        for (int i = 1; i <= 100; i++) {
            System.out.print(i + " ");
            if (i % 10 == 0) {
                System.out.println("");
            }
        }

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(((i * 10) + (j + 1)) + " ");
            }
            System.out.println("");
        }

        // Ask the User to Guess a Random Number.
        // If they guess too low, tell them "Guess Higher".
        // If they guess too high, tell them "Guess Lower".
        Scanner keyboard = new Scanner(System.in);

        Random rng = new Random();
        int value = rng.nextInt(100) + 1;
        int num;
        do {
            System.out.println("Pick a Number Between 1-100:");
            num = keyboard.nextInt();
            if (num < 1 || num > 100) {
                System.out.println("That's not between 1-100!");
            } else {
                if (num == value) {
                    System.out.println("GOOD JOB!");
                } else if (num > value) {
                    System.out.println("Guess Lower");
                } else {
                    System.out.println("Guess Higher");
                }
            }
        } while (num != value);
        
        // Output some words to a file.
        PrintWriter out = new PrintWriter("output.txt");
        out.println("Hello World");
        out.close();
        
        // Output some MORE words to the SAME file.
        FileWriter fileWriter = new FileWriter("output.txt", true);
        PrintWriter out2 = new PrintWriter(fileWriter);
        out2.println("Hello World");
        out2.close();

    }

}
