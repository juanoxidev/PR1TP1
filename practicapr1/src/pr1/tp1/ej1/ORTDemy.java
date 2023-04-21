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
		Usuario usuario = null;
		Usuario usuarioEncontrado = null;
		int i = 0;
		
		while(usuario == null || i <= this.usuarios.size()) {
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
		
		while(curso == null || i <= this.categorias.size()) {
			categoria = this.categorias.get(i);
			curso = categoria.buscarCurso(idCurso);
			i++;
		} 
		return curso;
		
	}
	
	@SuppressWarnings("unused")
	public Resultado suscribirseACurso(String idUsuario, String idCurso) {
		Usuario usuario;
		Curso curso;
		int becados;
		Resultado resultado;
		
		usuario = this.buscarUsuario(idUsuario);
		curso = this.buscarEnCategoria(idCurso);
		becados = curso.calcularBecados();
		
		if (usuario == null) {
			resultado = Resultado.USUARIO_INEX;
		} else if (curso == null) {
			resultado = Resultado.CURSO_INEX;
		} else if (becados == 5 && usuario.getBecado()) {
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
		
		return resultado;
	}
	
}
