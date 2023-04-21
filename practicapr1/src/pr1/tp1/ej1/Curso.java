package pr1.tp1.ej1;

import java.util.ArrayList;

public class Curso {

	private String titulo, ID;
	private int valoracion;
	private Usuario autor;
	private double precio;
	private ArrayList<Usuario> suscriptos;
	
	public Curso (String titulo, String ID, int valoracion, double precio, Usuario autor) {
		this.autor = autor;
		this.ID = ID;
		this.precio = precio;
		this.suscriptos = new ArrayList<Usuario>();
		this.titulo = titulo;
		this.valoracion = valoracion;
	}
	
	public void agregarSuscripto(Usuario usuario) {
		this.suscriptos.add(usuario);
	}
	
	public int calcularBecados() {
		int i = 0;
		for (Usuario usuario:this.suscriptos) {
			if(usuario.getBecado()) {
			i++;	
			} 
		}
		 return i;
	}
	
	public Usuario buscarSuscriptos(String idUsuario) {
		Usuario suscripto = null;
		Usuario suscriptoEncontrado = null;
		int i = 0;
		
		while( suscripto == null && i < this.suscriptos.size()) {
			suscripto = this.suscriptos.get(i);
			if(suscripto.getID().equals(idUsuario)) {
				suscriptoEncontrado = suscripto;
			} else {
				i++;
			}
		}
		
		return suscriptoEncontrado;
	}

	public String getID() {
		return this.ID;
	}

	public Usuario getAutor() {
		return this.autor;
	}
}
