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

package chapter7;

public class ParameterisedConstructorExample {

    private String name;
    private int age;

    public ParameterisedConstructorExample(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        ParameterisedConstructorExample example = new ParameterisedConstructorExample("Alice", 30);
        System.out.println("Name: " + example.getName());
        System.out.println("Age: " + example.getAge());
    }
}
