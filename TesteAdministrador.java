package Atv2;

public class TesteAdministrador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Administrador novoAdm = new Administrador();
		novoAdm.setNome("Bruno");
		novoAdm.setEndereco("Rua babosa da casa Z em frente ao colegio HJ");
		novoAdm.setSalario(1650.00);
		novoAdm.setTelefone("97456-0621");
		novoAdm.setAjudaDeCusto(300.00);
		System.out.println(novoAdm.toString());
		System.out.printf("O salário mais os benefícios é de: " +novoAdm.calcularSalario());

	}

}
