package com.ngm.psa.psa;

import lombok.Data;

@Data
public class Stock {
    private String ticker;
    private String fullname;
    private double price;

    public Stock(String ticker, String fullName, double price) {
        this.ticker = ticker;
        this.fullname = fullName;
        this.price = price;
    }
}
