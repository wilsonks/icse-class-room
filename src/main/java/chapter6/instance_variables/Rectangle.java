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

public class Rectangle {
    int length;
    int breadth;
    int area;
    int perimeter;
    double diagonal;

    public void inputdata() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of rectangle");
        length = sc.nextInt();
        System.out.println("Enter breadth of rectangle");
        breadth = sc.nextInt();
    }

    public void calculate() {
        area = length * breadth;
        perimeter = 2 * (length + breadth);
        diagonal = Math.sqrt(Math.pow(length, 2) + Math.pow(breadth, 2));
    }

    public void outputdata() {
        System.out.println("Area of rectangle: " + area);
        System.out.println("Perimeter of rectangle: " + perimeter);
        System.out.println("Diagonal of rectangle: " + diagonal);
    }

    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        rect.inputdata();
        rect.calculate();
        rect.outputdata();
    }
}
