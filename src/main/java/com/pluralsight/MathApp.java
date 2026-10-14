package com.pluralsight;

public class MathApp {

    public static void main(String[] args) {
        // Creating Bob and Gary salary variable
        double bobSalary = 50000.0;
        double garySalary = 65000.0;
        double highestSalary = Math.max(bobSalary, garySalary);
        System.out.println("The highest salary is " + highestSalary);

        // Finding smallest price between a car and truck
        double carPrice = 27000;
        double truckPrice = 75000;
        double  smallestPrice = Math.min(carPrice, truckPrice);
        System.out.println("The lowest price between the car and truck is: " + smallestPrice);

        //3




        //4 Find the square toot of a variable after setting it to 5.
        double myNum = 5.0;
        double squareRoot5 = Math.sqrt(myNum);
        System.out.println("The square root is " + squareRoot5);
    }
}
