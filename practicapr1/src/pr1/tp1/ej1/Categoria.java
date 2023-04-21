package pr1.tp1.ej1;

import java.util.ArrayList;

public class Categoria {
	
	private String ID, nombre;
	private ArrayList<Curso> cursos;
	
	public Categoria(String nombre, String ID) {
		this.nombre = nombre;
		this.ID = ID;
		this.cursos = new ArrayList<Curso>();
	}
	
	public Curso buscarCurso(String idCurso) {
		Curso curso = null;
		Curso cursoEncontrado = null;
		int i = 0;
		
		while(cursoEncontrado == null && i < this.cursos.size()) {
			curso = this.cursos.get(i);
			if(curso.getID().equals(idCurso)) {
				cursoEncontrado = curso;
			} else {
				i++;
			}
		}
		
		return cursoEncontrado;
	}

	public void agregarCurso(Curso curso) {
		this.cursos.add(curso);
	}
}
