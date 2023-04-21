package pr1.tp1.ej1;

public class Usuario {
	private String ID, nombre, mail;
	private boolean becado;
	
	public Usuario(String nombre, String mail, String ID, boolean becado) {
		this.becado = becado;
		this.ID = ID;
		this.nombre = nombre;
		this.mail = mail;
	}

	public boolean getBecado() {
		return this.becado;
	}

	public String getID() {
		return this.ID;
	}

}
