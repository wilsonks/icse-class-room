/*
 * *
 *  Copyright (c) 2026 Wilson K Sam
 *
 *  SPDX-License-Identifier: MIT
 *
 *  Chapter : Chapter 6 - Class as the Basis of all Computations
 *  Purpose:
 *  Notes:
 *    -
 *
 *
 */

package chapter6.instance_variables;

import java.util.Scanner;

public class Telephone {
    String name;
    int numberOfCalls;
    double bill;

    void input() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        name = input.nextLine();
        System.out.print("Enter number of calls: ");
        numberOfCalls = input.nextInt();
    }

    void calculate() {
        if(numberOfCalls <= 100) {
            bill = 0;
        } else if(numberOfCalls <= 200) {
            double first100 = 0;
            double next100 = (numberOfCalls - 100) * 1.5;
            bill = first100 +  next100 ;
        } else {
            System.out.println("Above 200 calls Category");
            double first100 = 0;
            double next100 = 100 * 1.5;
            double next = (numberOfCalls - 200) * 2.5;
            bill = first100 + next100 +  next;
        }
    }

    void print() {
        System.out.println("Name: " + name);
        System.out.println("Number of calls: " + numberOfCalls);
        System.out.println("Total Bill: " + bill);
    }

    public static void main(String[] args) {
        Telephone telephone = new Telephone();
        telephone.input();
        telephone.calculate();
        telephone.print();
    }
}
