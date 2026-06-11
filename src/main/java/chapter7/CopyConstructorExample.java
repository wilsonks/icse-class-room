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

public class CopyConstructorExample {

    private String name;
    private int age;

    // Copy constructor
    public CopyConstructorExample(CopyConstructorExample other) {
        this.name = other.name;
        this.age = other.age;
    }

    public CopyConstructorExample(String name, int age) {
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
        CopyConstructorExample original = new CopyConstructorExample("Alice", 30);
        CopyConstructorExample copy = new CopyConstructorExample(original);

        System.out.println("Original - Name: " + original.getName() + ", Age: " + original.getAge());
        System.out.println("Copy - Name: " + copy.getName() + ", Age: " + copy.getAge());
    }
}
