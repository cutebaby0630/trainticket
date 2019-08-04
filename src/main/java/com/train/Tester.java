
package com.train;

import java.util.Scanner;

public class Tester{
    public static void main(String[] args) {
        int exit = 0;
        Scanner scanner = new Scanner(System.in);
        while (exit != -1){


            System.out.println("Please enter number of tickets:");
            int tickets_num = scanner.nextInt();

            System.out.println("How many round-trip tickets:");
            int round_trip = scanner.nextInt();
            if (tickets_num < 1 || round_trip < 0 ){
                System.out.println("Please enter the true number");
            }
            else {
                Tickets tickets = new Tickets(tickets_num,round_trip);
                tickets.print();
                System.out.println("Continue to enter 0, Exit to enter -1");
                exit = scanner.nextInt();
            }
        }
        System.out.println("Thanks to having");
    }
}


