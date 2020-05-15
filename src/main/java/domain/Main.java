package domain;

import domain.lugares.Camino;
import domain.lugares.Compartimiento;
import domain.lugares.PuntoDeConsolidacion;

public class Main {
    public static void main(String[] args) {
        Deposito myDepo = new Deposito();
        myDepo.agregarAlgoAlDeposito(0,0,new Compartimiento(new Mercaderia("Donatelo - Tortiga Ninja")));
        myDepo.agregarAlgoAlDeposito(1,0,new Camino());
        myDepo.agregarAlgoAlDeposito(0,0,new PuntoDeConsolidacion());
    }
}
