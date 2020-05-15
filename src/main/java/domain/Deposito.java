package domain;

import domain.lugares.CosaQueOcupaUnEspacio;

import java.util.HashMap;

/**
 * @author Luca
 * @version 1.0
 * @created 15-May-2020 12:15:32 PM
 */
public class Deposito {


	HashMap<String, CosaQueOcupaUnEspacio> lugares;

	public Deposito(){
		lugares = new HashMap<String, CosaQueOcupaUnEspacio>();
	}


	public void configurarElDeposito(int coordenadaEnX,int coordenadaEnY,CosaQueOcupaUnEspacio algo){
		lugares.put(Coordenadas(coordenadaEnX, coordenadaEnY), algo);
		System.out.println(lugares.size());
	}



	public CosaQueOcupaUnEspacio QueHayEnEstaParteDelDeposito(int coordenadaEnX, int coordenadaEnY){
		CosaQueOcupaUnEspacio loQueEncontro = lugares.get(Coordenadas(coordenadaEnX, coordenadaEnY));
		System.out.println(loQueEncontro.queTiene());
		return loQueEncontro;
	}


	private String Coordenadas(int x,int y){
		//return x + "X" + y + "Y" ;
		return x + "," + y ;
	}

	public void guardarAlgoElDeposito(int coordenadaEnX, int coordenadaEnY,Mercaderia algoParaGuardar) {
		CosaQueOcupaUnEspacio loQueEncontro = lugares.get(Coordenadas(coordenadaEnX, coordenadaEnY));
		System.out.println(loQueEncontro.queTiene());
		loQueEncontro.ponerAlgo(algoParaGuardar);
	}
}