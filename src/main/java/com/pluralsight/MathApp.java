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
        double radius = 7.25;
        double area = Math.pow(radius, 2);
        System.out.println("The area is " + area);




        //4 Find the square toot of a variable after setting it to 5.
        double myNum = 5.0;
        double squareRoot5 = Math.sqrt(myNum);
        System.out.println("The square root is " + squareRoot5);

        //5 Find the distance between points (5, 10) and (85, 50)
        // Distance formula: square root of (x2 - x1)^2 + (y2 - y1)^2
        int x1 = 5, y1 = 10, x2 = 85, y2 = 50;
        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        System.out.println("The distance between the points is " + distance);


        // Absolute Value
        double negativeValue = -3.8;
        double aboluteValue = Math.abs(negativeValue);
        System.out.println("The absolute value is " + aboluteValue);

        // Finding a random number
        double randomNum = Math.random();
        System.out.println("The random number is " + randomNum);



    }
}
