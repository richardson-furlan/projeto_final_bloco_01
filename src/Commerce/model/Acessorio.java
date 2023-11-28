package Commerce.model;

public class Acessorio extends Produto{

	private String personalizado;
	
	public Acessorio(int id, int tipo, String nome, float preco,String persolanizado ) {
		super(id, tipo, nome, preco);
		this.personalizado = persolanizado;
	}

	public String isPersolanizado() {
		return personalizado;
	}

	public void setPersolanizado(String persolanizado) {
		this.personalizado = persolanizado;
	}
	
	@Override
	public void visualizar() {
		super.visualizar();
		if (personalizado.equalsIgnoreCase("S")) {
			System.out.println("o produto é pesonalizado");
			}else if (personalizado.equalsIgnoreCase("N")) {
			System.out.println("o produto não é pesonalizado");
			}
		System.out.println("O Acessorio é personalizado?\n " + this.isPersolanizado());
	}
	
}
