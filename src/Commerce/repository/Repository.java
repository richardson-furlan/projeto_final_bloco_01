package Commerce.repository;

import Commerce.model.Produto;

public interface Repository {
	public void criarProduto(Produto produto);
	public void listarProdutos();
	public void consultarProdutoPorId(int numero);
	public void atualizarProduto(int numero,Produto produto);
	public void deletarProduto(int numero);

	
}
