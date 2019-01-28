package com.train;

public class Ticket {
    private int price = 1000;
    private float discount = 0.9f;
    private int totalAmount;
    private int roundAmount;

    public void setTotalAmount(int totalAmount) {
        this.totalAmount = totalAmount;
    }

    public void setRoundAmount(int roundAmount) {
        this.roundAmount = roundAmount;
    }

    public int finalPrice() {
        return price * (totalAmount - roundAmount) + (int) (price * roundAmount * 2 * discount);
    }
}
