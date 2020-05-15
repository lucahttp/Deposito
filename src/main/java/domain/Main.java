package domain;

import domain.lugares.Compartimiento;

public class Main {
    public static void main(String[] args) {
        Deposito myDepo = new Deposito();
        myDepo.agregarAlgoAlDeposito(0,0,new Compartimiento(new Mercaderia("Donatelo - Tortiga Ninja")));
    }
}
