package domain;

import domain.lugares.CosaQueOcupaUnEspacio;

import java.util.HashMap;

/**
 * @author Luca
 * @version 1.0
 * @created 15-May-2020 12:15:32 PM
 */
public class Deposito {


	HashMap<Coordenadas, CosaQueOcupaUnEspacio> lugares;

	public Deposito(){
		lugares = new HashMap<Coordenadas, CosaQueOcupaUnEspacio>();
	}


	public void agregarAlgoAlDeposito(int coordenadaEnX,int coordenadaEnY,CosaQueOcupaUnEspacio algo){
		lugares.put(new Coordenadas(coordenadaEnX, coordenadaEnY), algo);
		System.out.println(lugares.size());
	}

}