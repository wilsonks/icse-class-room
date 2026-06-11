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

public class ShallowCopyDeepCopyExample {

    public static class Person{
        private String name;
        private int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        @Override
        public String toString() {
            return "Person{name='" + name + "', age=" + age + "}";
        }
    }

    public static void main(String[] args) {
        // Shallow Copy Example
        Person originalPerson = new Person("Alice", 30);
        Person shallowCopyPerson = originalPerson; // This creates a shallow copy (reference copy)

        System.out.println("Original Person: " + originalPerson);
        System.out.println("Shallow Copy Person: " + shallowCopyPerson);

        // Modifying the shallow copy will affect the original
        shallowCopyPerson.setName("Bob");
        System.out.println("\nAfter modifying shallow copy:");
        System.out.println("Original Person: " + originalPerson);
        System.out.println("Shallow Copy Person: " + shallowCopyPerson);

        // Deep Copy Example
        Person deepCopyPerson = new Person(originalPerson.getName(), originalPerson.getAge()); // This creates a deep copy

        System.out.println("\nDeep Copy Person: " + deepCopyPerson);

        // Modifying the deep copy will NOT affect the original
        deepCopyPerson.setName("Charlie");
        System.out.println("\nAfter modifying deep copy:");
        System.out.println("Original Person: " + originalPerson);
        System.out.println("Deep Copy Person: " + deepCopyPerson);
    }
}
