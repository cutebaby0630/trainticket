
package com.train;

import java.util.Scanner;

public class Tester{
    public static void main(String[] args) {
        int exit = 0;
        Scanner scanner = new Scanner(System.in);
        while (exit != -1){


            System.out.println("Please enter number of tickets:");
            int ticketsnum = scanner.nextInt();

            System.out.println("How many round-trip tickets:");
            int roundtrip = scanner.nextInt();
            if (ticketsnum < 1 || roundtrip < 0 ){
                System.out.println("Please enter the true number");
            }
            else {
                Tickets tickets = new Tickets(ticketsnum,roundtrip);
                tickets.print();
                System.out.println("Continue to enter 0, Exit to enter -1");
                exit = scanner.nextInt();
            }
        }
        System.out.println("Thanks to having");
    }
}


