package atividade_1.Program;

import atividade_1.models.*;

public class RestaurantProgram {

    public static void main(String[] args) {
        ContaRestaurante mesa1 = new ContaRestaurante(1022);

        mesa1.addClient(new Cliente("José"));
        mesa1.addClient(new Cliente("Laura"));
        mesa1.addClient(new Cliente("Júlia"));
        mesa1.addProduct(new Cerveja(1));
        mesa1.addProduct(new Refrigerante(3));
        mesa1.addProduct(new Comida(1.0));

        System.out.println(mesa1);

        mesa1.addClient(new Cliente("Marcos"));
        System.out.println();
        System.out.println(mesa1);
    }
}
