package pr1.tp3.ej6;

public class BiciElectrica extends Bicicleta{

	private int potencia;
	
	public BiciElectrica(String marca, String modelo, int potencia, double kilometraje) {
		super(marca, modelo, kilometraje);
		this.potencia = potencia;
	}

	public int getPotencia() {
		return potencia;
	}
	
	public boolean esAdmisible() {
		boolean esElectricaAdmisible = false;
		
		if(this.potencia <= 250 && getKilometraje() <= 2000) {
				esElectricaAdmisible = true;
		}
		
		return esElectricaAdmisible;
		
	}
}
