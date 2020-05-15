package domain.lugares;

public abstract class CosaQueOcupaUnEspacio {
    protected String tag;
    CosaQueOcupaUnEspacio algo;

    public CosaQueOcupaUnEspacio(CosaQueOcupaUnEspacio algo) {
        this.algo = algo;

    }

    protected CosaQueOcupaUnEspacio() {
    }

    public String queTiene(){
        return this.algo.tag;
    }
}
