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

package chapter6;

public class ChapterAtAGlance {
    public static void main(String[] args) {
        System.out.println("Chapter 6 - Class as the Basis of all Computations");
        System.out.println("""
                1. An object in real world is a unique entity that possesses some unique characteristics and behavior.
                2. An object can be - real world and software world.
                3. A software object: created while writing Java program
                4. An object in software object is unique entity that has data members (characteristics) and member methods(behavior).
                5. Class is a blueprint of representing similar types of objects.
                6. Object is referred to as an instance of a class.
                7. Class produces different objects of similar types - So its called as 'Object Factory.
                8. The syntax to create an object of a class can be described as
                    <class name> <object name> = new <class name> (parameter list)
                9. A single class can have a number of instances.
                10.Since, a class is created by the user, it is also known as user defined data type.
                11.The built-in data types, provided by the system, are known as primitive data types.
                12.A class may be designed with or without main() function.
                13.The internal contents of a class are 
                    1. Access Specifiers
                    2. Instance Variables
                    3. Class Variables
                    4. Local Variables
                    5. Member Methods
                    etc.
                14. The access specifiers are classified as public, private and protected.
                15. Data members declared within a class by using static keyword, are referred to as class variables.
                16. A member method which is declared static can only use static data members of the class.
                17. The keyword `this` is used to resolve the conflict between local variables and instance variables.
                18. The object from which the function is called can be identified with this keyword.
                """);
    }
}
