package exercicioTres;

import java.time.LocalDate;

public class Medico {
	private String crm;
	private String nome;
	private String especialidade;
	private String email;
	private LocalDate dataContratacao;
	private float salario;
	
	public Medico(String crm, String nome, String especialidade, String email, LocalDate dataContratacao,
			float salario) {
		this.crm = crm;
		this.nome = nome;
		this.especialidade = especialidade;
		this.email = email;
		this.dataContratacao = dataContratacao;
		this.salario = salario;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

	public void setCrm(String crm) {
		this.crm = crm;
	}

	public void setDataContratacao(LocalDate dataContratacao) {
		this.dataContratacao = dataContratacao;
	}

	public String getCrm() {
		return this.crm;
	}
	
	public LocalDate getDataContratacao() {
		return this.dataContratacao;
	}
	
	public void imprime() {
		System.out.println("CRM: "+crm);
		System.out.println("Nome: "+nome);
		System.out.println("Especialidade "+especialidade);
		System.out.println("Email: "+email);
		System.out.println("Data de contratação: "+dataContratacao);
		System.out.println("Salário: "+salario);
	}
}
