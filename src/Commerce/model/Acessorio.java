package Commerce.model;

public class Acessorio extends Produto{

	private boolean personalizado;
	
	public Acessorio(int id, int tipo, String nome, float preco,boolean persolanizado ) {
		super(id, tipo, nome, preco);
		this.personalizado = persolanizado;
	}

	public boolean isPersolanizado() {
		return personalizado;
	}

	public void setPersolanizado(boolean persolanizado) {
		this.personalizado = persolanizado;
	}
	
	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println("O Acessorio é personalizado?\n " + this.isPersolanizado());
	}
	
}
