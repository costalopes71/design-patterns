package com.costalopes.behavioral_patterns.chain_of_responsability;

abstract class Handler {

    protected Handler successor;

    void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    abstract void handle(Request request);

}
