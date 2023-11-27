package projeto_final_bloco_01;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		int opcao;
		
		
    	Scanner leia = new Scanner(System.in);
    	
    	do {

			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("                Furlan Instrumentos Musicais         ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("            1 - Adicionar Instrumento                ");
			System.out.println("            2 - Listar Todos os Instrumentos         ");
			System.out.println("            3 - Consultar Instrumento por Id         ");
			System.out.println("            4 - Atualizar Instrumento                ");
			System.out.println("            5 - Deletar Instrumento                  ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("Entre com a opção desejada:                          ");
			System.out.println("                                                     ");
			opcao = leia.nextInt();
    	
			switch(opcao) {
			case 1:
				System.out.println("Adicionar Instrumento");
				break;
			case 2:
				System.out.println("Listar Todos os Instrumentos");
				break;
			case 3:
				System.out.println("Consultar Instrumento por Id");
				break;
			case 4:
				System.out.println("Atualizar Instrumento");
				break;
			case 5:
				System.out.println("Atualizar Instrumento");
				break;
			default:
				System.out.println("Opção invalida");
				
				
			}
    	} while(opcao != 6); 
    
	}
}