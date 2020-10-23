package Atv2;

public class Empregado extends Pessoa {
	public double salario;

	public double getSalario() {
		return salario;
	}

	public Empregado() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Empregado(String nome, String endereco, String telefone) {
		super(nome, endereco, telefone);
		// TODO Auto-generated constructor stub
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "Empregado [salario=" + salario + ", nome=" + nome + ", endereco=" + endereco + ", telefone=" + telefone
				+ "]";
	}

}
