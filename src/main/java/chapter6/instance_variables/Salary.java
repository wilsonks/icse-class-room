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

public class Salary {
    String name;
    String address;
    String subject;
    long phone;
    double monthlySalary;
    double incomeTax;

    void accept() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Name:");
        name = input.nextLine();
        System.out.println("Enter Address:");
        address = input.nextLine();
        System.out.println("Enter Subject:");
        subject = input.nextLine();
        System.out.println("Enter Phone Number:");
        phone = input.nextLong();
        System.out.println("Enter Monthly Salary:");
        monthlySalary = input.nextDouble();
    }

    void calculate() {
        if(12 * monthlySalary > 1_75_000) {
            incomeTax = (12 * monthlySalary) - (double) (1_75_000 * 5) /100;
        } else  {
            incomeTax = 0;
        }
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Subject: " + subject);
        System.out.println("Phone Number: " + phone);
        System.out.println("Monthly Salary: " + monthlySalary);
        System.out.println("Income Tax: " + incomeTax);
    }

    public static void main(String[] args) {
        Salary salary = new Salary();
        salary.accept();
        salary.calculate();
        salary.display();
    }

}
