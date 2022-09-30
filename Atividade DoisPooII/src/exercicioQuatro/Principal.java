package exercicioQuatro;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Professor p1 = new Professor(1, "Sherk","Mestre", "11111111", "sherk@dominio.com", 1994.08);
		Professor p2 = new Professor(2, "Fiona","Doutor", "22222222", "fiona@dominio.com", 2356.78);
		Professor p3 = new Professor(3, "Burro","Mestre", "33333333", "burro@dominio.com", 1994.08);
		Professor p4 = new Professor(4, "Rei","Mestre", "444444", "rei@dominio.com", 1994.08);
		Professor p5 = new Professor(5, "Encantado","Mestre", "55555555", "encantado@dominio.com", 1994.08);
		
		Departamento dep = new Departamento("Ciências Biológicas e da Saúde", "5555555", "c.b.s@dominio.com");
		
		dep.adicionarProfessor(p1);
		dep.adicionarProfessor(p2);
		dep.adicionarProfessor(p3);
		dep.adicionarProfessor(p4);
		dep.adicionarProfessor(p5);
		
		dep.imprime();
		dep.excluirProfessor(4);
		System.out.println("____________________________");
		dep.imprime();
	}

}
