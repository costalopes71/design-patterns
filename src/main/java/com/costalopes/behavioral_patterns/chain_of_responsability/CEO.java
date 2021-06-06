package com.costalopes.behavioral_patterns.chain_of_responsability;

class CEO extends Handler {

    @Override
    void handle(Request request) {
        System.out.println("CEOs can approve anything");
    }

}
