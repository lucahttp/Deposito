package domain;

import java.util.HashMap;

public class Pedido {

    HashMap<String, Integer> pedido;

    Pedido(){
        this.pedido = new HashMap<String, Integer>();
    }

    public void agregarProducto(String nombreDelProducto,Integer cantidad) {
        pedido.put(nombreDelProducto,cantidad);
        System.out.println(pedido.size());
    }

    public HashMap<String, Integer> queHayEnMiPedido(){
        return this.pedido;
    }

    public HashMap<String, Integer> solicitarPedido(){
        return this.pedido;
    }

}
