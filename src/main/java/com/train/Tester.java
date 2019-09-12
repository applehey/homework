package com.train;

import java.util.Scanner;

public class Tester {
   public static void main(String[] args) {

       userInput();
   }

    private static void userInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter number of tickets:");
        int count = scanner.nextInt();
        System.out.println("How many round-trip tickets:");
        int discount = scanner.nextInt();
        Ticket ticket = new Ticket(count,discount);
        ticket.print();
    }
}
