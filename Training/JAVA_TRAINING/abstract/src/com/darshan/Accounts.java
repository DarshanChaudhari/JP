package com.darshan;

public class Accounts {

    private String accountNo;
    private String custName;
    private double balance;

    public Accounts(String accountNo, String custName, double balance){
        this.accountNo = accountNo;
        this.custName = custName;
        this.balance = balance;
    }


    public void deposit(){
        System.out.println("Dear " + this.custName + "Amount is deposit in your account");
    }

    public void withdraw(){
        System.out.println("Dear " + this.custName + "Amount is withdraw from your account");
    }
}
