package com.train;

public class Tickets {
    int totaltickets;
    int roundTripTickets;
    int price;

    public  Tickets(int total_tickets, int round_trip_tickets){
        this.totaltickets = total_tickets;
        this.roundTripTickets = round_trip_tickets;
    }

    public void print(){
        price =  (int) ((totaltickets - roundTripTickets) * 1000 + roundTripTickets * 2000 * 0.9);
        System.out.println("Total tickets:" + totaltickets );
        System.out.println("Round-trip:" + roundTripTickets);
        System.out.println("Total: " + price);
    }
}
