package Atv2;

public class TesteFornecedor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   Fornecedor novoFornecedor = new Fornecedor();
		   novoFornecedor.setNome("Antonio");
		   novoFornecedor.setEndereco("Rua X do lado da Rua Y");
		   novoFornecedor.setTelefone("98557-2063");
		   novoFornecedor.setValorCredito(55.0);
		   novoFornecedor.setValorDivida(20.0);
		   novoFornecedor.obterSaldo();
		   //resultado da conta é 35
	     
	}

}
