package pr1.tp1.ej1;

public class test {

	public static void main(String[] args) {
		ORTDemy ort = new ORTDemy ();
		Usuario autor = new Usuario ("Juanito", "juanito@gmail.com", "01", true);
		Categoria cate = new Categoria ("informatica","01");
		Curso curso = new Curso ("pr1","01",1, 10.01, autor);
		Usuario anotar1 = new Usuario ("pepito", "juanito@gmail.com", "02", true);
		Usuario anotar2 = new Usuario ("juli", "juanito@gmail.com", "03", true);
		Usuario anotar3 = new Usuario ("marce", "juanito@gmail.com", "04", true);
		Usuario anotar4 = new Usuario ("carlos", "juanito@gmail.com", "05", true);
		Usuario anotar5 = new Usuario ("martin", "juanito@gmail.com", "06", true);
		Usuario anotar6 = new Usuario ("tincho", "juanito@gmail.com", "07", true);
		
		cate.agregarCurso(curso);
		ort.agregarCategoria(cate);
		ort.agregarUsuario(anotar1);
		ort.agregarUsuario(anotar2);
		ort.agregarUsuario(anotar3);
		ort.agregarUsuario(anotar4);
		ort.agregarUsuario(anotar5);
		ort.agregarUsuario(anotar6);
		
		ort.suscribirseACurso("10", "02");
		ort.suscribirseACurso("02", "02");
		ort.suscribirseACurso("02", "01");
		ort.suscribirseACurso("03", "01");
		ort.suscribirseACurso("04", "01");
		ort.suscribirseACurso("05", "01");
		ort.suscribirseACurso("06", "01");
		ort.suscribirseACurso("07", "01");
		
		
	}

}
