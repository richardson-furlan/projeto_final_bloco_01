package Commerce;

import java.io.IOException;
import java.util.Scanner;

import Commerce.controler.ProdutoControler;
import Commerce.model.Acessorio;
import Commerce.model.Instrumento;



public class Menu {

	public static void main(String[] args) {
		ProdutoControler produtos = new ProdutoControler();

		Scanner leia = new Scanner(System.in);
		int id, tipo;
		String nome, marca, personalizado;
		float preco;
		int opcao;
		
		
    	do {

			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("                Furlan Instrumentos E Acessorios     ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("            1 - Cadastrar produto                    ");
	        System.out.println("            2 - Listar todos os produtos             ");
	        System.out.println("            3 - Buscar produto por ID                ");
	        System.out.println("            4 - Apagar Produto                       ");
	        System.out.println("            5 - Sair                                 ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("Entre com a opção desejada:                          ");
			System.out.println("                                                     ");
			opcao = leia.nextInt();
    	
			switch(opcao) {
			case 1:
				System.out.println("Adicionar produto");
				
				
				
				System.out.println("Digite o nome do produto: ");
				leia.skip("\\R?");
				nome = leia.nextLine();
				
				
				do {
					System.out.println("Digite se o produto é: (1) instrumento ou () acessório: ");
					tipo = leia.nextInt();
				}while(tipo < 1 || tipo > 2);
				
				
				System.out.println("Digite o Preço do Produto (R$): ");
				preco = leia.nextFloat();
				
				if (tipo == 1) {
					
						System.out.println("Digite a marca: ");
						marca = leia.nextLine();
						produtos.criarProduto(new Instrumento (produtos.gerarNumero(), tipo, nome, preco, marca));
					}else{
						System.out.println("Digite se o produto é pesonalizado( S / N ): ");
						personalizado = leia.nextLine();
						
						produtos.criarProduto(new Acessorio (produtos.gerarNumero(), tipo, nome, preco, personalizado));
					}
				
				break;
				
			case 2:
				System.out.println("Listar Todos os produtos");
				produtos.listarProdutos();
				
				break;
			case 3:
				System.out.println("Consultar produtos por Id");
				
				System.out.println("Digite o Id do produto");
				id = leia.nextInt();
				produtos.consultarProdutoPorId(id);
				
				break;
			
			case 4:
				System.out.println("Deletar produtos");
				
				System.out.println("Digite o Id do produto");
				id = leia.nextInt();
				
				produtos.deletarProduto(id);
				break;
			default:
				System.out.println("Opção invalida");
				
				
			}
    	} while(opcao != 5); 
    	
    	System.out.println("Obrigado pela preferência!!");
    	
    	
	}
	
	
}