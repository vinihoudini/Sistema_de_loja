package Atv2;

public class TesteVendedor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Vendedor novoVendedor = new Vendedor();
novoVendedor.setNome("Pedro augusto");
novoVendedor.setEndereco("Rua das agulhas num 140");
novoVendedor.setSalario(3200.00);
novoVendedor.setComissao(35.00);
novoVendedor.setTelefone("998564-3756");
novoVendedor.setValorVendas(100.00);
novoVendedor.VendedorCalcularSalario();
// o resultado será de 6.700

	}

}
