package exercicioDois;

public class Pessoa {
	private String nome;
	private String telefone;
	private String email;
	private String endereco;
	
	public Pessoa() {
		
	}

	public Pessoa(String nome, String telefone, String email, String endereco) {
		this.nome = nome;
		this.telefone = telefone;
		this.email = email;
		this.endereco = endereco;
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

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return this.nome;
	}
	
	public void imprimir() {
		System.out.println("Nome: "+this.nome);
		System.out.println("Telefone: "+this.telefone);
		System.out.println("Email: "+this.email);
		System.out.println("Endereço: "+this.endereco);
	}
}
