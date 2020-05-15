package domain.lugares;

import domain.Mercaderia;

public class PuntoDeConsolidacion extends CosaQueOcupaUnEspacio {

    public PuntoDeConsolidacion(){
        this.tag = "PuntoDeConsolidacion";
    }

    public void ponerAlgo(Mercaderia preducto){
        System.out.println("No se puede poner algo aca, esto es un "+this.tag);
        this.ocupado = false;
    }
}
