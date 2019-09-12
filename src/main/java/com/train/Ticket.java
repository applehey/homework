package com.train;

public class Ticket {
    int count;
    int discount;
    public Ticket(int count, int discount) {
        this.count = count;
        this.discount = discount;
    }
    public void print() {
        System.out.println("Total tickets: " + (count + discount) + " Round-trip: " + discount +
                " Total: " + getAverage() );
    }
    public int getAverage() {
        return (count * 1000) + ((int)(discount * 2000 * 0.9));
    }
}

