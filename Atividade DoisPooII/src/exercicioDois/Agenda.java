package exercicioDois;

import java.util.ArrayList;

public class Agenda {
	private ArrayList<Pessoa> contatos;
	
	public Agenda() {
		contatos = new ArrayList<Pessoa>();
	}
	
	public ArrayList<Pessoa> getContatos() {
		return contatos;
	}

	public void setContatos(ArrayList<Pessoa> contatos) {
		this.contatos = contatos;
	}



	public void adicionarContato(Pessoa contato) {
		contatos.add(contato);
		return;
	}
	
	public boolean excluirContato(String nome) {
		for(Pessoa pessoaAux : contatos) {
			if(pessoaAux.getNome() == nome)
				return contatos.remove(pessoaAux);
		}
		return false;
	}
	
	public boolean buscarContato(String nome) {
		for(Pessoa pessoaAux : contatos) {
			if(pessoaAux.getNome() == nome)
				return true;
		}
		return false;
	}
	
	public void imprime() {
		for(Pessoa pessoaAux : contatos) {
			pessoaAux.imprimir();
		}
		return;
	}
}
