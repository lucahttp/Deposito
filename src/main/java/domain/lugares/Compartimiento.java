package domain.lugares;


import domain.Mercaderia;

/**
 * @author Luca
 * @version 1.0
 * @created 15-May-2020 12:15:40 PM
 */
public class Compartimiento extends CosaQueOcupaUnEspacio {

	private Mercaderia loQueAlmaceno;

	Compartimiento(Mercaderia preducto){
		this.tag = "Compartimiento";
		this.loQueAlmaceno = preducto;
	}
}//end Compartimiento