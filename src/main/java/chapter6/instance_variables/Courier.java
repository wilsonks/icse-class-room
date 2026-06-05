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

public class Courier {
    String name;
    double weight;
    String address;
    double bill;
    char type;

    void accept() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter customer name:");
        name = input.nextLine();
        System.out.println("Enter customer address:");
        address = input.nextLine();
        System.out.println("Enter weight:");
        weight = input.nextDouble();
        System.out.println("Enter parcel type 'D' or 'I'");
        type = input.next().charAt(0);
    }

    void calculate() {
        if(weight <= 5) {
            bill = weight * 800;
        } else if(weight <= 10) {
            double above5kg = weight - 5;
            bill = 5 * 800 + above5kg * 700;
        } else {
            double above10kg = weight - 10;
            bill = 5 * 800 + 5  * 700 + above10kg * 500;
        }

        if(type == 'I') {
            bill = bill + 1500;
        }
    }

    void print() {
        System.out.println("Customer Name: " + name);
        System.out.println("Customer Address: " + address);
        System.out.println("Parcel Weight: " + weight);
        System.out.println("Parcel Type: " + type);
        System.out.println("Bill Amount: " + bill);
    }


    public static void main(String[] args) {
        Courier courier = new Courier();
        courier.accept();
        courier.calculate();
        courier.print();
    }
}
