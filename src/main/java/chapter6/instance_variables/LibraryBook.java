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

public class LibraryBook {
    int accessionNumber;
    String title;
    String author;


    void input() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter title: ");
        title = input.nextLine();
        System.out.print("Enter author: ");
        author = input.nextLine();
        System.out.print("Enter accession number: ");
        accessionNumber = input.nextInt();
    }

    void compute() {
        Scanner input = new Scanner(System.in);
        int numberOfDays;
        int fine;
        System.out.println("Enter the number of days the book is returned late: ");
        numberOfDays = input.nextInt();
        fine = numberOfDays * 2;
        System.out.println("Fine to be paid: " + fine);
    }

    void display() {
        System.out.println("Accession Number: " + accessionNumber);
        System.out.println("Book Title: " + title);
        System.out.println("Book Author: " + author);
    }

    public static void main(String[] args) {
        LibraryBook book = new LibraryBook();
        book.input();
        book.compute();
        book.display();
    }
}
