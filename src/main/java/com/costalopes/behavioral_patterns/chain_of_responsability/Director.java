package com.costalopes.behavioral_patterns.chain_of_responsability;

import static com.costalopes.behavioral_patterns.chain_of_responsability.RequestType.CONFERENCE;

class Director extends Handler {

    @Override
    void handle(Request request) {

        if (CONFERENCE.equals(request.getRequestType())) {
            System.out.println("Directors can approve conferences");
        } else {
            successor.handle(request);
        }

    }

}
