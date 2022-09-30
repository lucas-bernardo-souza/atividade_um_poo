package exercicioTres;

import java.util.ArrayList;

public class Hospital {
	private String nome;
	private String endereco;
	private ArrayList<Medico> medicosContratados;
	
	public Hospital() {
		medicosContratados = new ArrayList<Medico>();
	}
	
	public Hospital(String nome, String endereco) {
		this.nome = nome;
		this.endereco = endereco;
		medicosContratados = new ArrayList<Medico>();
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public ArrayList<Medico> getMedicosContratados() {
		return medicosContratados;
	}

	public void setMedicosContratados(ArrayList<Medico> medicosContratados) {
		this.medicosContratados = medicosContratados;
	}

	public void adicionarMedico(Medico medico) {
		medicosContratados.add(medico);
		return;
	}
	
	public boolean excluirMedico(String CRM) {
		for(Medico medAux:medicosContratados) {
			if(medAux.getCrm() == CRM)
				return medicosContratados.remove(medAux);
		}
		return false;
	}
	
	public void exibirMedicosAno(int ano) {
		for(Medico medAux:medicosContratados) {
			if(medAux.getDataContratacao().getYear() == ano)
				medAux.imprime();
		}
		return;
	}
	
	public void imprime() {
		System.out.println("Hospital "+nome);
		System.out.println(endereco);
		for(Medico medAux:medicosContratados) {
			medAux.imprime();
		}
		return;
	}
}
