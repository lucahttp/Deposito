package domain;

import domain.lugares.Camino;
import domain.lugares.Compartimiento;
import domain.lugares.PuntoDeConsolidacion;

public class Main {
    public static void main(String[] args) {
        Deposito myDepo = new Deposito();

        myDepo.configurarElDeposito(0,0,new Compartimiento());
        myDepo.guardarAlgoElDeposito(0,0,new Mercaderia("Power Ranger ROJO"));
        myDepo.configurarElDeposito(1,0,new Camino());
        myDepo.guardarAlgoElDeposito(1,0,new Mercaderia("Power Ranger AZUL"));
        myDepo.configurarElDeposito(3,0,new PuntoDeConsolidacion());




        Pedido pedidoDeRoberto = new Pedido();


        pedidoDeRoberto.agregarProducto("Power Ranger ROJO",2);
        
    }
}
