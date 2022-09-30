package exercicioDois;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pessoa p1 = new Pessoa("Michael Ferreira", "18998776544", "michael.ferreira@dominio.com", "19050650, Rua: Mamoel Goulart, "
				+ "1250 - Presidente Prudente SP");
		Pessoa p2 = new Pessoa("Vitória Sanches da Silva", "18998776544", "vitoria.silva@dominio.com", "19050650, Rua: Mamoel Goulart, "
				+ "1250 - Presidente Prudente SP");
		Pessoa p3 = new Pessoa("Lidiane Gonçalves", "18998776544", "lidiane.goncalves@dominio.com", "19050650, Rua: Mamoel Goulart, "
				+ "1250 - Presidente Prudente SP");
		Pessoa p4 = new Pessoa("Aparecido Veira", "18998776544", "aparecido.vieria@dominio.com", "19050650, Rua: Mamoel Goulart, "
				+ "1250 - Presidente Prudente SP");
		Pessoa p5 = new Pessoa("Manoel Vieira", "18998776544", "manoel.vieira@dominio.com", "19050650, Rua: Mamoel Goulart, "
				+ "1250 - Presidente Prudente SP");
		
		Agenda agenda = new Agenda();
		
		agenda.adicionarContato(p1);
		agenda.adicionarContato(p2);
		agenda.adicionarContato(p3);
		agenda.adicionarContato(p4);
		agenda.adicionarContato(p5);
		
		agenda.imprime();
		
		System.out.println("_____________________________________________________________");
		
		if(agenda.buscarContato("Manoel Vieira"))
			System.out.println("Manoel Vieira está na sua lista de contato!");
		else
			System.out.println("Manoel Vieira não está na sua lista de contato!");
		
		System.out.println("_____________________________________________________________");
		
		if(agenda.excluirContato("Manoel Vieira"))
			System.out.println("Manoel Vieira foi excluido");
		
		System.out.println("_____________________________________________________________");
		
		if(agenda.buscarContato("Manoel Vieira"))
			System.out.println("Manoel Vieira está na sua lista de contato!");
		else
			System.out.println("Manoel Vieira não está na sua lista de contato!");
		
		System.out.println("_____________________________________________________________");
		
		agenda.imprime();
		
		System.out.println("_____________________________________________________________");
		
	}

}
