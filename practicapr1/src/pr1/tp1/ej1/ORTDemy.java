package pr1.tp1.ej1;

import java.util.ArrayList;

public class ORTDemy {
	private ArrayList<Usuario> usuarios;
	private ArrayList<Categoria> categorias;
	
	
	public ORTDemy() {
		this.categorias = new ArrayList<Categoria>();
		this.usuarios = new ArrayList<Usuario>();
	}
	
	public Usuario buscarUsuario(String idUsuario) {
		Usuario usuario;
		Usuario usuarioEncontrado = null;
		int i = 0;
		
		while(usuarioEncontrado == null && i < this.usuarios.size()) {
			usuario = this.usuarios.get(i);
			if(usuario.getID().equals(idUsuario)) {
				usuarioEncontrado = usuario;
			} else {
				i++;
			}
		}
		return usuarioEncontrado;
	}
	
	public Curso buscarEnCategoria(String idCurso) {
		Curso curso = null;
		Categoria categoria;
		int i = 0;
		do {
			
			categoria = this.categorias.get(i);
		curso = categoria.buscarCurso(idCurso);
		i++;
			
		} while(i < this.categorias.size());
		return curso;
		
	}
	
	public Resultado suscribirseACurso(String idUsuario, String idCurso) {
		Usuario usuario;
		Curso curso;
		int becados;
		Resultado resultado = null;
		
		usuario = this.buscarUsuario(idUsuario);
		curso = this.buscarEnCategoria(idCurso);
		
		if (usuario != null && curso !=null) { 
			becados = curso.calcularBecados(); 
			if (becados == 5 && usuario.getBecado()) {
				resultado = Resultado.MAX_BECADOS;
			} else if (curso.buscarSuscriptos(usuario.getID()) == null) {
				if (usuario == curso.getAutor()) {
					resultado = Resultado.ES_AUTOR;
				} else {
					resultado = Resultado.SUSCRIPTO_OK;
					curso.agregarSuscripto(usuario);
				}
			} else {
				resultado = Resultado.YA_SUSCRIPTO;
			}
			
		}	else if (usuario == null) {
			resultado = Resultado.USUARIO_INEX;
			
		} else if (curso == null ){
			resultado = Resultado.CURSO_INEX;
		} 
		
		return resultado;
	}
	
	public void agregarCategoria(Categoria cate) {
		this.categorias.add(cate);
	}
	
	
		public void agregarUsuario(Usuario usuario) {
			this.usuarios.add(usuario);
	}
}
