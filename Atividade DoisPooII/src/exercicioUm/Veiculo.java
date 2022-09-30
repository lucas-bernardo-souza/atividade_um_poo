package exercicioUm;

public class Veiculo {
	private String nome;
	private String montadora;
	private int anoFabricacao;
	private int anoModelo;
	private String cor;
	private String placa;
	private float valorIpva;
	private boolean ipvaPago;
	
	public Veiculo() {
		
	}
	
	public Veiculo(String nome, String montadora, int anoFabricacao, int anoModelo, String cor, String placa,
			float valorIpva, boolean ipvaPago) {
		this.nome = nome;
		this.montadora = montadora;
		this.anoFabricacao = anoFabricacao;
		this.anoModelo = anoModelo;
		this.cor = cor;
		this.placa = placa;
		this.valorIpva = valorIpva;
		this.ipvaPago = ipvaPago;
	}
	
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMontadora() {
		return montadora;
	}

	public void setMontadora(String montadora) {
		this.montadora = montadora;
	}

	public int getAnoFabricacao() {
		return anoFabricacao;
	}

	public void setAnoFabricacao(int anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}

	public int getAnoModelo() {
		return anoModelo;
	}

	public void setAnoModelo(int anoModelo) {
		this.anoModelo = anoModelo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public float getValorIpva() {
		return valorIpva;
	}

	public void setValorIpva(float valorIpva) {
		this.valorIpva = valorIpva;
	}

	public boolean isIpvaPago() {
		return ipvaPago;
	}

	public void setIpvaPago(boolean ipvaPago) {
		this.ipvaPago = ipvaPago;
	}

	public boolean verificarStatusIpva() {
		return ipvaPago;
	}
	
	public void atualizarValorIpva(float reajuste) {
		this.valorIpva += valorIpva * reajuste;
	}
	
	public void imprime() {
		System.out.println("Nome: "+this.nome);
		System.out.println("Montadora: "+this.montadora);
		System.out.println("Ano de fabricação: "+this.anoFabricacao);
		System.out.println("Ano do modelo: "+this.anoModelo);
		System.out.println("Cor do veículo: "+this.cor);
		System.out.println("Placa de veículo: "+this.placa);
		System.out.println("Valor do IPVA: "+this.valorIpva);
		if(this.ipvaPago)
			System.out.println("Status do IPVA: Pago");
		else
			System.out.println("Statuso do IPVA: Pagamento pendente!");
	}
}
