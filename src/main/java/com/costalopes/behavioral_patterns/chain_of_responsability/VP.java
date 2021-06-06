package com.costalopes.behavioral_patterns.chain_of_responsability;

import static com.costalopes.behavioral_patterns.chain_of_responsability.RequestType.PURCHASE;

class VP extends Handler {

    @Override
    void handle(Request request) {

        if (PURCHASE.equals(request.getRequestType())) {
            if (request.getAmount() < 1500) {
                System.out.println("VPs can approve purchases below 1500");
            } else {
                successor.handle(request);
            }
        }

    }

}
