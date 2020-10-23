package Atv2;

public class Vendedor extends Empregado {
	public double valorVendas;
	public double comissao;

	public double getValorVendas() {
		return valorVendas;
	}

	public void setValorVendas(double valorVendas) {
		this.valorVendas = valorVendas;
	}

	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}

	@Override
	public String toString() {
		return "Vendedor [valorVendas=" + valorVendas + ", comissao=" + comissao + ", salario=" + salario + ", nome="
				+ nome + ", endereco=" + endereco + ", telefone=" + telefone + "]";
	}

	public Vendedor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Vendedor(String nome, String endereco, String telefone) {
		super(nome, endereco, telefone);
		// TODO Auto-generated constructor stub
	}

	public double VendedorCalcularSalario(){
		return this.getSalario() + valorVendas * comissao;
		
	}
	
	
}
