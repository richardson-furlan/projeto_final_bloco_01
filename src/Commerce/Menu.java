package Commerce;

import java.util.Scanner;
import Commerce.model.Acessorio;
import Commerce.model.Instrumento;

public class Menu {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int numero,tipo;
		String nome,marca;
		boolean persolanizado;
		float preco;
		int opcao;
		
		//Teste Acessorio (int id, int tipo, String nome, float preco,boolean persolanizado )
		Acessorio a1 = new Acessorio (2,2,"Palheta",5.00f,true);
		a1.visualizar();
		//Teste Instrumento (int id, int tipo, String nome, float preco,String marca)
		Instrumento i1= new Instrumento (3,1,"Violão",650.00f,"Giannini");
		i1.visualizar();
		
		
    	do {

			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("                Furlan Instrumentos Musicais         ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("            1 - Cadastrar produto                    ");
	        System.out.println("            2 - Listar todos os produtos             ");
	        System.out.println("            3 - Buscar produto por ID                ");
	        System.out.println("            4 - Atualizar produto                    ");
	        System.out.println("            5 - Apagar Produto                       ");
	        System.out.println("            6 - Sair                                 ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("Entre com a opção desejada:                          ");
			System.out.println("                                                     ");
			opcao = leia.nextInt();
    	
			switch(opcao) {
			case 1:
				System.out.println("Adicionar produto");
				break;
			case 2:
				System.out.println("Listar Todos os produtos");
				break;
			case 3:
				System.out.println("Consultar produtos por Id");
				break;
			case 4:
				System.out.println("Atualizar produtos");
				break;
			case 5:
				System.out.println("Deletar produtos");
				break;
			default:
				System.out.println("Opção invalida");
				
				
			}
    	} while(opcao != 6); 
    	
    	System.out.println("Obrigado pela preferência!!");
    
	}
}