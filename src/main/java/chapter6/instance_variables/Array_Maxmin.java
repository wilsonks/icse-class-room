/*
 * *
 *  Copyright (c) 2026 Wilson K Sam
 *
 *  SPDX-License-Identifier: MIT
 *
 *  Chapter : Chapter 6 - Class as the Basis of all Computations
 *  Purpose: Write a program by using class to input an integer array of 10 numbers as instance variables
 *  Class Name: Array_Maxmin
 *  Data Memebrs:
 *          int m[]
 *          int min
 *          int max
 *  Member nethods
 *      - void input() - Accept a list of 10 integers
 *      - void max() - find and store greatest integer
 *      - void min() - find and store smallest integer
 *      - void display() - to print min and max
 *  Notes:
 *    -
 *
 *
 */

package chapter6.instance_variables;

import java.util.Scanner;

public class Array_Maxmin {

    int m[] = new int[10];
    int max;
    int min;

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 10 Numbers:");
        for (int i = 0; i < 10; i++) {
            m[i] = sc.nextInt();
        }
        max = m[0];
        min = m[0];
    }

    void max() {
        for (int i = 0; i < 10; i++) {
            if (m[i] > max) {
                max = m[i];
            }
        }
    }
    void min() {
        for (int i = 0; i < 10; i++) {
            if (m[i] < min) {
                min = m[i];
            }
        }
    }

    void display() {
        System.out.println("Maximum number is: " + max);
        System.out.println("Minimum number is: " + min);
    }


    public static void main(String[] args) {
        Array_Maxmin obj = new Array_Maxmin();
        obj.input();
        obj.max();
        obj.min();
        obj.display();

    }
}
