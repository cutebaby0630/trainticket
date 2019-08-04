package com.train;

public class Tickets {
    int total_tickets;
    int round_trip_tickets;
    int price;
    int exit;

    public  Tickets(int total_tickets, int round_trip_tickets){
        this.total_tickets = total_tickets;
        this.round_trip_tickets = round_trip_tickets;
    }

    public void print(){
        price =  (int) ((total_tickets - round_trip_tickets) * 1000 + round_trip_tickets * 2000 * 0.9);
        System.out.println("Total tickets:" + (total_tickets + round_trip_tickets));
        System.out.println("Round-trip:" + round_trip_tickets);
        System.out.println("Total: " + price);
    }
}
