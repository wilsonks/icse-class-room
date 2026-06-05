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

public class ElectricityBill {
    String name;
    int units;
    double amount;
    double surcharge;

    void accept() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter name: ");
        name = input.nextLine();
        System.out.print("Enter units: ");
        units = input.nextInt();
    }

    void calculate() {
        if(units <= 100) {
            surcharge = 0;
            amount = units * 2.0;
        } else if (units <= 300) {
            surcharge = 0;
            amount = (units - 100) * 3.0 + 100 * 2.0;
        } else {
            amount = (units - 300) * 5.0 + 200 * 3.0 + 100 * 2.0;
            surcharge = units * 0.025;
        }
        amount = amount + surcharge;
    }
    void display() {
        System.out.printf("Name: %s%n", name);
        System.out.printf("Units: %d%n", units);
        System.out.printf("Amount: %.2f%n", amount);
    }

    public static void main(String[] args) {
        ElectricityBill billObj = new ElectricityBill();
        billObj.accept();
        billObj.calculate();
        billObj.display();
    }
}
