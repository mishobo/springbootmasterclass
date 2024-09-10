package com.husseinabdallah.SpringBootMasterClass.strategyparttern;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CreditCardStrategy implements PaymentStrategy {

    private String name;
    private String cardNumber;
    private String cvv;
    private String dateOfExpiry;


    @Override
    public void pay(int amount) {
        System.out.println(amount +" paid with credit/debit card");
    }
}
