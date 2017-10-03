package com.coffee.store.domain;

public class Customer {

    private String customerId;
    private String name;
    private String address;
    private Integer noOfOrdersMade;

    public Customer() {
        super();
    }

    public Customer(String productId, String name, String address) {
        this.customerId = productId;
        this.name = name;
        this.address = address;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getNoOfOrdersMade() {
        return noOfOrdersMade;
    }

    public void setNoOfOrdersMade(Integer noOfOrdersMade) {
        this.noOfOrdersMade = noOfOrdersMade;
    }
}
