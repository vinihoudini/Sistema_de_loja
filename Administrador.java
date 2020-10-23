package Atv2;

public class Administrador extends Empregado {
	public double ajudaDeCusto;

	public double getAjudaDeCusto() {
		return ajudaDeCusto;
	}

	public void setAjudaDeCusto(double ajudaDeCusto) {
		this.ajudaDeCusto = ajudaDeCusto;
	}

	@Override
	public String toString() {
		return "Administrador [ajudaDeCusto=" + ajudaDeCusto + ", salario=" + salario + ", nome=" + nome + ", endereco="
				+ endereco + ", telefone=" + telefone + "]";
	}

	public Administrador() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Administrador(String nome, String endereco, String telefone) {
		super(nome, endereco, telefone);
		// TODO Auto-generated constructor stub
	}
	
	public double calcularSalario() {
		return this.getSalario() + ajudaDeCusto;
	}

}
