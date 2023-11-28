package Commerce.controler;

import java.util.ArrayList;

import Commerce.model.Produto;
import Commerce.repository.Repository;


public class ProdutoControler implements Repository {

	private ArrayList<Produto> listaProdutos = new ArrayList<Produto>();
	int numero = 0;
	
	@Override
	public void criarProduto(Produto produto) {
		listaProdutos.add(produto);
		System.out.println("\nO Produto " + produto.getNome() + " foi adicionado com sucesso!");

		
	}

	@Override
	public void listarProdutos() {
		for(var produto : listaProdutos) {
			produto.visualizar();
		}
	}

	@Override
	public void consultarProdutoPorId(int numero) {
		var produto = buscarNaCollection(numero);

		if (produto != null)
			produto.visualizar();
		else
			System.out.println("\nA Conta número: "+ numero + " não foi encontrada!");
	
		
	}

	@Override
	public void deletarProduto(int numero) {
		var produto = buscarNaCollection(numero);

		if(produto != null){
			if(listaProdutos.remove(produto) == true) 
			System.out.println("Produto removido com sucesso.");
		} 
			System.out.println("PRODUTO NÃO CADASTRADO");
		
	}
	
	public int gerarNumero() {
		return ++ numero;
	}
	
	public Produto buscarNaCollection(int numero) {
		for (var produto : listaProdutos) {
			if (produto.getId() == numero) {
				return produto;
			}
		}
		
		return null;
	}
	
	
}
