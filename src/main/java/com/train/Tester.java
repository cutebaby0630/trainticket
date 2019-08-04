package com.train;

import java.util.Scanner;

public class Tester{
    public static void main(String[] args) {
        int exit = 0;

        while (exit != -1){
            Scanner scanner = new Scanner(System.in);

            //使用者輸入總票數
            System.out.println("Please enter number of tickets:");
            int ticketsnum = scanner.nextInt();

            //使用者輸入來回票張數
            System.out.println("How many round-trip tickets:");
            int roundtrip = scanner.nextInt();

            //判斷輸入是否為有效張數
            if (ticketsnum <= 0 || roundtrip < 0 ){
                System.out.println("Please enter the true number");
            }
            else {
                //印出結果
                Tickets tickets = new Tickets(ticketsnum,roundtrip);
                tickets.print();
                //詢問是否繼續
                System.out.println("Continue to enter 0, Exit to enter -1");
                exit = scanner.nextInt();
            }
        }
        System.out.println("Thanks to having");
    }
}


