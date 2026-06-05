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

public class Security {
    private String name; // To store the name of the security
    private int hour; //store number of hours
    private double rate; //to store the hourly rate
    private double wage; //to calculate wage

    void get(String name, int hour, double rate) {
        this.name = name;
        this.hour = hour;
        this.rate = rate;
    }

    void calwage() {
        /*
            Upto 40 hours - 1 rupee per hour
            next 20 hours - 1.5 rupee per hour
            next 20 hours - 2 rupee per hour
         */
        if (hour <= 40) wage = 40 * rate;
        if(hour > 40 && hour <= 60) {
            wage = (hour - 40) * 1.5 * rate + 40 * rate ;
        }
        if(hour > 60 ) {
            wage = ((hour - 60) * 2) + 20 * 1.5 * rate + 40 * rate ;
        }
    }
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Hour: " + hour);
        System.out.println("Rate: " + rate);
        System.out.println("Wage: " + wage);
    }

    public static void main(String[] args) {
        Security security = new Security();
        security.get("Sher Khan", 65, 1);
        security.calwage();
        security.display();
    }
}
