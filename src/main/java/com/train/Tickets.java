package com.train;

public class Tickets {
    int totaltickets;
    int roundTripTickets;
    int price;

    public  Tickets(int ticketsnum, int roundtrip){
        this.totaltickets = ticketsnum;
        this.roundTripTickets = roundtrip;
    }

    public void print(){
        price =  (int) ((totaltickets - roundTripTickets) * 1000 + roundTripTickets * 2000 * 0.9);
        System.out.println("Total tickets:" + totaltickets );
        System.out.println("Round-trip:" + roundTripTickets);
        System.out.println("Total: " + price);
    }
}
