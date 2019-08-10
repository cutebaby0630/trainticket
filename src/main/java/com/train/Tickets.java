package com.train;

public class Tickets {
    int ticketsNum;
    int roundTrip;
    int price;

    public  Tickets(int ticketsnum, int roundtrip){
        this.ticketsNum = ticketsnum;
        this.roundTrip = roundtrip;
    }

    public void print(){
        price =  (int) ((ticketsNum - roundTrip) * 1000 + roundTrip * 2000 * 0.9);
        System.out.println("Total tickets:" + ticketsNum );
        System.out.println("Round-trip:" + roundTrip);
        System.out.println("Total: " + price);
    }
}
