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

public class Student {
    String name;
    double percentage;
    String certificate;

    void input() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter name: ");
        name = input.nextLine();
        System.out.println("Enter percentage: ");
        percentage = input.nextDouble();
    }


    void merit() {
        if(percentage >= 90) {
            certificate = "Merit Certificate Awarded";
        } else {
            certificate = "Merit Certificate Not Awarded";
        }
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Percentage: " + percentage);
        System.out.println("Certificate: " + certificate);
    }

    public static void main(String[] args) {
        Student student = new Student();
        student.input();
        student.merit();
        student.display();
    }

}
