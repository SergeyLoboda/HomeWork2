package com.epam.homework;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("How many money to deposit? -> ");
        double money = scan.nextInt();

        System.out.print("Select the number of months for a deposit  ->");
        int month = scan.nextInt();

        System.out.print("Percents ->");
        int percents = scan.nextInt();


        double raise = (money / 100 * percents) / 6 * month;
        System.out.println("You put "+(int)money+" dollars on "+ month+" month "+" by  "
                + percents+"%\n"+"After " + month + " months, you will receive " +
                (int)raise  + " dollars of revenue");
    }
}
