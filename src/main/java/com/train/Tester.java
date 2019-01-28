package com.train;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Ticket ticket = new Ticket();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter number of tickets: ");
        int amount = scanner.nextInt();
        ticket.setTotalAmount(amount);

        System.out.print("How many round-trip tickets: ");
        int round = scanner.nextInt();
        ticket.setRoundAmount(round);

        System.out.println("Total tickets: " + amount);
        System.out.println("Round-trip: " + round);
        System.out.println("Total: " + ticket.finalPrice());
    }
}
