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

public class BookFair {
    private String bookName;
    double price;
    double discount;
    double amount;

    void input(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter book name: ");
        bookName = input.nextLine();
        System.out.print("Enter price: ");
        price = input.nextDouble();
    }

    void calculate(){
        if(price <= 1000){
            discount = price * 0.02;
        } else  if(price <= 3000){
            discount = price * 0.10;
        } else {
            discount = price * 0.15;
        }
        amount = price * discount;
    }

    void display(){
        System.out.println("Book Name: " + bookName);
        System.out.println("Price: " + price);
        System.out.println("Discount: " + discount);
        System.out.println("Amount: " + amount);
    }

    public static void main(String[] args) {
        BookFair bookFair = new BookFair();
        bookFair.input();
        bookFair.calculate();
        bookFair.display();
    }
}

