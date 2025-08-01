package com.desafio_pic_pay.api_picpay.DTO;


import jakarta.persistence.Table;

@Table(name = "Transferencias")
public class RequestTransfer {
    private long reciverId;
    private long payerId;
    private double balance;

    public long getReciverId() {
        return reciverId;
    }

    public void setReciverId(long reciverId) {
        this.reciverId = reciverId;
    }

    public long getPayerId() {
        return payerId;
    }

    public void setPayerId(long payerId) {
        this.payerId = payerId;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
