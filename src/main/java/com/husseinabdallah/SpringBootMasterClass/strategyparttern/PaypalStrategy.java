package com.husseinabdallah.SpringBootMasterClass.strategyparttern;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class PaypalStrategy implements PaymentStrategy {

    private String emailId;
    private String password;


    @Override
    public void pay(int amount) {
        System.out.println(amount + " paid using Paypal.");
    }
}
