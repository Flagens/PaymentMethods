package com.company;

import java.util.Scanner;

import static com.company.PaymentMethods.*;
import static com.company.RandomSituations.randomsituation;

public class Program {
    public static void program() {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter payment method");
        String paymentMethod = myObj.nextLine();
        try {
            PaymentEnum pm = PaymentEnum.valueOf(paymentMethod);
            if (pm == PaymentEnum.card || pm == PaymentEnum.blik) {
                System.out.println("*blik or card situation*");
                if (randomsituation(1)) {
                    System.out.println("terminal is on");
                    if (randomsituation(1)) {
                        System.out.println("terminal has internet connection");
                        if (pm == PaymentEnum.blik) {
                            //blikPayment();
                        } else {
                            //cardPayment();
                        }
                    } else {
                        System.out.println("terminal has no internet connection");
                    }
                } else {
                    System.out.println("terminal is off");
                }
            } else if (pm == PaymentEnum.cash) {
                cashPayment();

            }
        } catch (Exception e) {
            System.err.println("No such payment");
            program();
        }

        }
    }

