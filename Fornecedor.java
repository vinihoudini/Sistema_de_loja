package Atv2;

public class Fornecedor extends Pessoa {

	private double valorCredito;
	private double valorDivida;

	public double getValorCredito() {
		return valorCredito;
	}

	public void setValorCredito(double valorCredito) {
		this.valorCredito = valorCredito;
	}

	@Override
	public String toString() {
		return "Fornecedor [valorCredito=" + valorCredito + ", valorDivida=" + valorDivida + ", nome=" + nome
				+ ", endereco=" + endereco + ", telefone=" + telefone + "]";
	}

	public Fornecedor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Fornecedor(String nome, String endereco, String telefone) {
		super(nome, endereco, telefone);
		// TODO Auto-generated constructor stub
	}

	public double getValorDivida() {
		return valorDivida;
	}

	public void setValorDivida(double valorDivida) {
		this.valorDivida = valorDivida;
	}

	
	
	public double obterSaldo() {
		
		return valorCredito - valorDivida;
		
	}
}
