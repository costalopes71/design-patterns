package com.costalopes.behavioral_patterns.chain_of_responsability;

class Request {

    private final RequestType requestType;
    private final double amount;

    Request(RequestType requestType, double amount) {
        this.requestType = requestType;
        this.amount = amount;
    }

    RequestType getRequestType() {
        return requestType;
    }

    double getAmount() {
        return amount;
    }

}
