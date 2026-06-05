/*
 * *
 *  Copyright (c) 2026 Wilson K Sam
 *
 *  SPDX-License-Identifier: MIT
 *
 *  Chapter : Chapter 6 - Class as the Basis of all Computations
 *  Purpose: 'this' keyword in member functions to resolve calling object/instance
 *  Notes:
 *    - `this` keyword can be used to resolve the conflict between local variables and instance variables
 *    - `this` keyword can be used to read or update instance variables of calling object
 *    - Developers may make mistake not to use this keyword in update member methods/functions
 *
 *
 */

package chapter6.this_keyword;

public class Test1 {
    int n; //instance variable

    void update(int n){
        this.n = n; //Correct: instance variable is getting updated
//        n = n; // Wrong - Local variable(Formal Parameter) is getting updated
    }

    void show(){
        System.out.println("Value of instance variable n:"+n);
    }

    public static void main(String[] args) {
        Test1 instance =  new Test1();
        instance.update(15);
        instance.show(); //Prints 15
        instance.update(20);
        instance.show(); //Prints 20

    }
}
