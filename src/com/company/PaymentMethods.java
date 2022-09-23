package com.company;

import java.util.Scanner;

import static com.company.Program.program;
import static com.company.RandomSituations.randomsituation;
import static com.company.ArrayInput.arrayInput;
import static com.company.Main.main;

public class PaymentMethods {
    static int trials = 0;
    static float price = 100;
    static int kodBlik = 1234;

    static int moneyBlik = 150;
    static void cashPayment() {
            try {
                Scanner s = new Scanner(System.in);
                if (arrayInput() > price) {
                    System.out.println("receipt " + price);
                } else {
                    System.out.println("U dont have enought cash");
                    trials++;
                    if (trials == 3) {
                        System.out.println("Sorry try again later");
                    } else {
                        program();
                    }
                }
            } catch (Exception e) {
                System.out.println("Error Cash");
            }
        }

    static void blikPayment() {
        try {
            Scanner s = new Scanner(System.in);
            System.out.println("Enter kod blik");
            int kodBlika = s.nextInt();
            if (kodBlika != kodBlik) {
                System.out.println("Invalid kod");
            } else if( moneyBlik < price) {
                System.out.println("U dont have enought money to buy this");
            } else if (randomsituation(99)) {
                System.out.println("Transaction wasnt confirmed on phone");
            } else if (randomsituation(99)) {
                System.out.println("Pobranie srodkow sie nie udalo");
            } else {
                System.out.println("Do u want confirmation? 1 - yes, 2 - no");
                int confirmation = s.nextInt();
                if(confirmation == 1) {
                    System.out.println("confirmation");
                } else {
                    System.out.println("no confirmation");
                }
            }
        } catch (Exception e) {
            System.out.println("Error");
        }
    }

    static void cardPayment() {
        try {
            System.out.println("cardpayment");
        } catch (Exception e) {
            System.out.println("Error");
        }
    }

}
