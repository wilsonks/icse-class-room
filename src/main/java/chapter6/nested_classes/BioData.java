
/*
 * *
 *  Copyright (c) 2026 Wilson K Sam
 *
 *  SPDX-License-Identifier: MIT
 *
 *  Chapter : Chapter 6 - Class as the Basis of all Computations
 *  Purpose: Nesting of classes allowed in Java
 *  Notes:
 *    - Use case 1: To define internal data of some class like Address
 *
 *
 */

package chapter6.nested_classes;

public class BioData {
    String name;
    int age;
    Address address;

    BioData(String name, int age, Address address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public void displayBioData(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
    }

    static class Address {
        String city;
        String state;
        String country;
        int pin;

        Address(){

        }

        Address(String city, String state, String country, int pin) {
            this.city = city;
            this.state = state;
            this.country = country;
            this.pin = pin;
        }

        @Override
        public String toString() {
            return "Address{" +
                    "city='" + city + '\'' +
                    ", state='" + state + '\'' +
                    ", country='" + country + '\'' +
                    ", pin=" + pin +
                    '}';
        }
    }

    public static void main(String[] args) {
        BioData bioData1 = new BioData("Shivam Dubey", 24, new Address("Indore", "Madhya Pradesh", "India", 452001));
        BioData bioData2 = new BioData("Dinesh Karthik", 38, new Address("Chennai", "Tamil Nadu", "India", 600001));
        BioData bioData3 = new BioData("Rajath Patidar", 24, new Address("Indore", "Madhya Pradesh", "India", 452001));
        BioData bioData4 = new BioData("Virat Kohli", 35, new Address("Delhi", "Delhi", "India", 110001));


        bioData1.displayBioData();
        bioData2.displayBioData();
        bioData3.displayBioData();
        bioData4.displayBioData();
    }
}
