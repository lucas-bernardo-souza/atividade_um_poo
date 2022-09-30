package exercicioUm;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Veiculo gol = new Veiculo("Gol", "Volkswagem", 2017, 2018, "Azul", "AKG-2765", 3612.19F, true);
		Veiculo jetta = new Veiculo("Jetta", "Volkswagem", 2017, 2018, "Preto", "CCK-2634", 3612.19F, false);
		Veiculo polo = new Veiculo("Polo", "Volkswagem", 2017, 2018, "Branco", "VKK-0697", 3612.19F, true);
		Veiculo voyage = new Veiculo("Voyage", "Volkswagem", 2017, 2018, "Preto", "BGG-2735", 3612.19F, true);
		Veiculo golf = new Veiculo("Golf", "Volkswagem", 2017, 2018, "Cinza", "AJK-2795", 3612.19F, true);
		
		gol.atualizarValorIpva(0.1F);
		jetta.atualizarValorIpva(0.1F);
		polo.atualizarValorIpva(0.1F);
		voyage.atualizarValorIpva(0.1F);
		golf.atualizarValorIpva(0.1F);
		
		gol.imprime();
		jetta.imprime();
		polo.imprime();
		voyage.imprime();
		golf.imprime();
	}

}
