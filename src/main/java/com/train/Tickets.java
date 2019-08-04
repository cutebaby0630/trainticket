package com.train;

public class Tickets {
    int one_way_tickets;
    int round_trip_tickets;
    int price;

    public  Tickets(int one_way_tickets, int round_trip_tickets){
        this.one_way_tickets = one_way_tickets;
        this.round_trip_tickets = round_trip_tickets;
    }

    public void print(){
        price =  (int) ((one_way_tickets + round_trip_tickets) * 1000 + round_trip_tickets * 2000 * 0.9);
        System.out.println("Total tickets:" + (one_way_tickets + round_trip_tickets));
        System.out.println("Round-trip:" + round_trip_tickets);
        System.out.println("Total: " + price);
    }
}
