package pr1.tp3.ej6;

public class Bicicleta {

	private String marca, modelo;
	private double kilometraje;
	
	public Bicicleta(String marca, String modelo, double kilometraje) {
		this.marca = marca;
		this.modelo = modelo;
		this.kilometraje = kilometraje;
	}
	public String getMarca() {
		return marca;
	}
	public String getModelo() {
		return modelo;
	}
	public double getKilometraje() {
		return kilometraje;
	}
	public boolean esAdmisible() {
		boolean esAdmisible = false;
		BiciElectrica electrica;
		
		if(this instanceof BiciElectrica) {
			electrica = (BiciElectrica) this;
			if(electrica.esElectricaAdmisible()) {
				esAdmisible = true;
			} 
			} else if(this.getKilometraje() <= 2000) {
				esAdmisible = true;
		}
				
		return esAdmisible;
	}
}
