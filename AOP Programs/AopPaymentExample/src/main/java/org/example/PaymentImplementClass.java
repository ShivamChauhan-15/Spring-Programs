package org.example;

public class PaymentImplementClass implements Payment {
    //joinpoint
    public void makePayment(int amount){
        System.out.println(amount+" credited");
        System.out.println(amount+" debited");
    }
}
