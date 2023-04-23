package pr1.tp3.ej6;

import java.util.ArrayList;

public class Taller {

	private ArrayList<Bicicleta> bicicletas;
	
	public Taller() {
		this.bicicletas = new ArrayList<Bicicleta>();
	}
	
	public void agregarBici(Bicicleta bici) {
		this.bicicletas.add(bici);		
	}
	
	public int cantidadServiciosPosibles(ArrayList<Bicicleta> bicis) {
		
		int i = 0;
		
		for (Bicicleta bicicleta : bicis) {
		if(bicicleta.esAdmisible()) {
			agregarBici(bicicleta);
			i++;
		}
		}
		return i;
	}
}
