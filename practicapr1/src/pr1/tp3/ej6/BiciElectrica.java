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
	
	public boolean esElectricaAdmisible() {
		boolean esElectricaAdmisible = false;
		Bicicleta bici;
		
		if(this.potencia <= 250) {
			bici = this;
			if(bici.getKilometraje() <= 2000) {
				esElectricaAdmisible = true;
			}
		}
		
		return esElectricaAdmisible;
		
	}
}
