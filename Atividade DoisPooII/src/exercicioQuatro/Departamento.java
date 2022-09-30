package exercicioQuatro;

import java.util.ArrayList;

public class Departamento {
	private String nome;
	private String telefone;
	private String email;
	private ArrayList<Professor> professores;
	
	public Departamento() {
		professores = new ArrayList<Professor>();
	}

	public Departamento(String nome, String telefone, String email) {
		this.nome = nome;
		this.telefone = telefone;
		this.email = email;
		this.professores = new ArrayList<Professor>();
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public ArrayList<Professor> getProfessores() {
		return professores;
	}

	public void setProfessores(ArrayList<Professor> professores) {
		this.professores = professores;
	}

	public void adicionarProfessor(Professor professor) {
		professores.add(professor);
		return;
	}
	
	public boolean buscarProfessor(int matricula) {
		for(Professor profAux:professores) {
			if(profAux.getMatricula() == matricula)
				return true;
		}
		return false;
	}
	
	public boolean excluirProfessor(int matricula) {
		if(this.buscarProfessor(matricula)) {
			for(Professor profAux:professores) {
				if(profAux.getMatricula() == matricula)
					return professores.remove(profAux);
			}
		}
		return false;
	}
	
	public void imprime() {
		System.out.println("Nome do departamento: "+this.nome);
		System.out.println("Telefone: "+this.telefone);
		System.out.println("Email: "+this.email);
		for(Professor profAux:professores) {
			profAux.imprimir();
		}
		return;
	}
}
