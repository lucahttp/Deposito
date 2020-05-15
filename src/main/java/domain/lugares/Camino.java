package domain.lugares;


import domain.Mercaderia;

public class Camino extends CosaQueOcupaUnEspacio {

    public Camino(){
        this.tag = "Camino";
    }

    public void ponerAlgo(Mercaderia preducto){
        System.out.println("No se puede poner algo aca, esto es un "+this.tag);
        this.ocupado = false;
    }
}
