package com.company;

import java.util.Scanner;


import static com.company.ArrayInput.getSum;
import static com.company.Program.program;
import static com.company.RandomSituations.randomsituation;
import static com.company.ArrayInput.arrayInput;


public class PaymentMethods {
    static int trials = 0;
    static float price = 100;
    static int kodBlik = 1234;

    static int moneyBlik = 150;


    static void cashPayment() {
            try {
                Scanner s = new Scanner(System.in);
                if (arrayInput() > price) {
                    float a = getSum() - price;
                    String formattedString = String.format("%.02f", a);
                    System.out.println( formattedString + " your restidue");
                } else {
                    System.out.println("U dont have enought cash");
                    System.out.println("1 if u want to end transaction, 2 if u want to insert diffrent banknotes 3 if u want to try diffrent payment");
                    int contnueVariable = s.nextInt();
                    if (contnueVariable == 3) {
                        trials++;
                        if (trials == 3) {
                            System.out.println("Sorry try again later");
                        } else {
                            program();
                        }
                    } else if (contnueVariable == 2) {
                        trials++;
                        if ( trials == 3) {
                            System.out.println("Sorry try again later");
                        } else {
                            cashPayment();
                        }
                    } else if (contnueVariable == 1) {
                        System.out.println("Good bye");
                    }
                }
            } catch (Exception e) {
                System.out.println("Something went wrong, proably u didnt enter int/float");
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
