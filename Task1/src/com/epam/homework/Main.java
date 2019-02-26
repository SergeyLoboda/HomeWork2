package com.epam.homework;

public class Main {

    public static void main(String[] args) {
            int y = 53, x = 23;
            print(x, y);
            x = x + y;
            y = x - y;
            x = x - y;
            print(x, y);
        }

        private static void print(int x, int y) {
            System.out.println("X = " + x + "; " + "Y = " + y);
        }
    }