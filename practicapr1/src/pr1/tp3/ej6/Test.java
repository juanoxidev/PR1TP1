package pr1.tp3.ej6;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		Taller lodelolo = new Taller();
		
		Bicicleta bici1 = new Bicicleta("mitsubishi", "ladetumama", 1100);
		Bicicleta bici2 = new Bicicleta("mitsubishi", "ladetumama", 5000);
		Bicicleta bici3 = new Bicicleta("mitsubishi", "ladetumama", 1999);
		Bicicleta bici4 = new Bicicleta("mitsubishi", "ladetumama", 2001);
		Bicicleta bici5 = new BiciElectrica("mitsubishi", "ladetumama", 230, 100);
		Bicicleta bici6 = new BiciElectrica("mitsubishi", "ladetumama", 240, 5000);
		Bicicleta bici7 = new BiciElectrica("mitsubishi", "ladetumama", 250, 1999);
		Bicicleta bici8 = new BiciElectrica("mitsubishi", "ladetumama", 260, 2001);
		
		ArrayList<Bicicleta> bicis = new ArrayList<Bicicleta>();
		
		bicis.add(bici1);
		bicis.add(bici2);
		bicis.add(bici3);
		bicis.add(bici4);
		bicis.add(bici5);
		bicis.add(bici6);
		bicis.add(bici7);
		bicis.add(bici8);
		
		System.out.println(lodelolo.cantidadServiciosPosibles(bicis));
		
		
		
		
		
		

	}

}
