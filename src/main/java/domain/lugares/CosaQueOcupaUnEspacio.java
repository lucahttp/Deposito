package domain.lugares;

import domain.Mercaderia;

public abstract class CosaQueOcupaUnEspacio {
    protected String tag;
    protected boolean ocupado;
    CosaQueOcupaUnEspacio algo;

    protected CosaQueOcupaUnEspacio() {
    }

    public String queTiene(){
        return this.tag;
    }

    public void ponerAlgo(Mercaderia algoParaGuardar) {
    }
}
