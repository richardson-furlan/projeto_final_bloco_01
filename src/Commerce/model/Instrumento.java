package Commerce.model;

public class Instrumento extends Produto{

	private String marca;
	
	public Instrumento(int id, int tipo, String nome, float preco,String marca) {
		super(id, tipo, nome, preco);
		this.marca = marca;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println("A marca do Instrumento: " + this.marca);
	}
	
}
