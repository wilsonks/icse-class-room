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

public class ConstructorOverloadingExample {

    private String name;
    private int age;

    // Default constructor
    public ConstructorOverloadingExample() {
        this.name = "Unknown";
        this.age = 0;
    }

    // Parameterized constructor
    public ConstructorOverloadingExample(String name, int age) {
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
        ConstructorOverloadingExample defaultExample = new ConstructorOverloadingExample();
        System.out.println("Default Constructor - Name: " + defaultExample.getName() + ", Age: " + defaultExample.getAge());

        ConstructorOverloadingExample parameterizedExample = new ConstructorOverloadingExample("Alice", 30);
        System.out.println("Parameterized Constructor - Name: " + parameterizedExample.getName() + ", Age: " + parameterizedExample.getAge());
    }
}
