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

public class DefaultConstructorExample {

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        DefaultConstructorExample example = new DefaultConstructorExample();
        System.out.println("Name: " + example.getName());
        System.out.println("Age: " + example.getAge());
    }
}
