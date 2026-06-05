/*
 * *
 *  Copyright (c) 2026 Wilson K Sam
 *
 *  SPDX-License-Identifier: MIT
 *
 *  Chapter : Chapter 6 - Class as the Basis of all Computations
 *  Purpose: Check understanding of this keyword in instance variables of multiple objects
 *  Notes:
 *    - The object from which the function is called can be identified with this keyword
 *    - `this` keyword can be used to resolve the conflict between local variables and instance variables
 *
 *
 */

package chapter6.this_keyword;

public class Test2 {

    int a;
    int b;

    void getVal(int x, int y){
        a =  x;
        b = y;
    }

    void display(){
        System.out.println("Sum of a = "+a);
        System.out.println("Sum of b = "+b);
    }

    void sumobj(Test2 p, Test2 q) {
        //There are other 2 objects p and q in the context other than calling instance
        //p.a --> p object's a instance variable
        //p.b --> p object's b instance variable
        //q.a --> q object's  a instance variable
        //q.b --> q object's  b instance variable
        //this.a --> calling object's a instance variable
        //this.b --> calling object's b instance variable
        int a = 5, b = 10; //Local variables
        this.a = p.a + q.a;
        this.b = p.b + q.b;

        System.out.println("Sum of local variables a and b: "+(a+b));
    }

    public static void main(String[] args) {
        Test2 obj1 = new Test2();
        Test2 obj2 = new Test2();
        Test2 obj3 = new Test2();

        obj1.getVal(2, 3);
        obj2.getVal(4, 6);
        obj3.sumobj(obj1, obj2);
        obj3.display();

    }

}
