package domain.lugares;


import domain.Mercaderia;

/**
 * @author Luca
 * @version 1.0
 * @created 15-May-2020 12:15:40 PM
 */
public class Compartimiento extends CosaQueOcupaUnEspacio {

	private Mercaderia loQueAlmaceno;

	public Compartimiento(){
		this.tag = "Compartimiento";
		this.ocupado = false;
	}


	public void ponerAlgo(Mercaderia preducto){

		System.out.println("se le guardo un "+preducto.queEs());
		this.loQueAlmaceno = preducto;
		this.ocupado = true;
	}

	public boolean tieneAlgo(){
		return this.ocupado;
	}
}//end Compartimiento