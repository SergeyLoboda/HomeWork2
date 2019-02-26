package com.epam.homework;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter weight in pounds -> ");
        double pound = scan.nextDouble();

        double weight = pound*0.4536;
        double gramm = (weight - (int)weight)*1000;

        System.out.println("Weight in kg " + (int)weight +" kg "+ (int)gramm + " gr");

    }
}
