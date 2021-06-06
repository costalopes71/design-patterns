package com.costalopes.behavioral_patterns.chain_of_responsability;

/**
 * Resumo:
 * - desacopla quem mandou a requisicao de quem recebeu a requisicao. Quem mandou sabe quem lidou com a requisicao e quem recebeu nao sabe quem enviou.
 * - pode ser configuravel em tempo de execucao
 * - por natureza tem uma estrutura hierarquica entre os Handlers
 * - cuidado com grandes Chains pq pode levar a um problema de performance ou deixar muito confuso onde a logico de negocio esta configurada
 */
class ChainOfResponsibilityDemo {

    public static void main(String[] args) {

        Director bryan = new Director();
        VP john = new VP();
        CEO ralf = new CEO();

        bryan.setSuccessor(john);
        john.setSuccessor(ralf);

        Request request1 = new Request(RequestType.CONFERENCE, 500);
        Request request2 = new Request(RequestType.PURCHASE, 1000);
        Request request3 = new Request(RequestType.PURCHASE, 2000);

        bryan.handle(request1);
        bryan.handle(request2);
        bryan.handle(request3);

    }

}
