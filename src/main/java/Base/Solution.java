package Base;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution 10
 *  Copyright 2021 Ivedent Lloyd III
 */

import java.text.DecimalFormat;
import java.util.Scanner;

public class Solution {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        double item01Price = firstItem();
        double item01Quantity = quantity01();

        double item02Price = secondItem();
        double item02Quantity = quantity02();

        double item03Price = thirdItem();
        double item03Quantity = quantity03();

        double subtotal = (item01Price * item01Quantity) + (item02Price * item02Quantity) + (item03Price * item03Quantity);
        double tax = subtotal * 0.055;

        double totalCost = subtotal + tax;

        System.out.println("Subtotal: $" + String.format("%.2f", subtotal));
        System.out.println("Tax: $" + String.format("%.2f", tax));
        System.out.println("Total: $" + String.format("%.2f", totalCost));

    }


        private static int firstItem () {

            System.out.print("Enter the price of item 1: ");
            String price01 = in.nextLine();
            int item01Price = Integer.parseInt(price01);
            return item01Price;

        }

        private static int quantity01 () {

            System.out.print("Enter the quantity of item 1: ");
            String quantity01 = in.nextLine();
            int item01Quantity = Integer.parseInt(quantity01);
            return item01Quantity;

        }

        private static int secondItem () {

            System.out.print("Enter the price of item 2: ");
            String price02 = in.nextLine();
            int item02Price = Integer.parseInt(price02);
            return item02Price;

        }

        private static int quantity02 () {

            System.out.print("Enter the quantity of item 2: ");
            String quantity02 = in.nextLine();
            int item02Quantity = Integer.parseInt(quantity02);
            return item02Quantity;

        }

        private static int thirdItem () {

            System.out.print("Enter the price of item 3: ");
            String price03 = in.nextLine();
            int item03Price = Integer.parseInt(price03);
            return item03Price;

        }

        private static int quantity03 () {

            System.out.print("Enter the quantity of item 3: ");
            String quantity03 = in.nextLine();
            int item03Quantity = Integer.parseInt(quantity03);
            return item03Quantity;

        }
}
