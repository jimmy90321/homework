package com.train;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Ticket ticket = new Ticket();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter number of tickets: ");
        int amount = scanner.nextInt();
        do {
            ticket.setTotalAmount(amount);

            System.out.print("How many round-trip tickets: ");
            int round = checkRound(scanner, amount);
            ticket.setRoundAmount(round);
            ticket.printOut();

            System.out.print("Please enter number of tickets( Or enter \"-1\" to quit system): ");
            amount = scanner.nextInt();
        } while (amount != -1);

        System.out.println("Thanks for your order~");
    }

    private static int checkRound(Scanner scanner, int amount) {
        int round = scanner.nextInt();
        while (round > amount) {
            System.out.println("Amount of round-trip tickets can't higher than total amount, please enter again");
            System.out.print("How many round-trip tickets: ");
            round = scanner.nextInt();
        }
        return round;
    }
}
