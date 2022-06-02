package JavaAtividade;

public class Velho extends Imovel{
	public Velho(){}
	public Velho(String endereco, Double preco) {
		super(endereco, preco);
	}
	public Velho(String endereco, Double preco, String nome) {
		this(endereco, preco);
		this.nome = nome;
	}
	@Override
	public Double consultar() {
		return this.getPreco()-this.getPreco()*0.5;
	}
	//toString
	public String toString() {
		return this.getEndereco() + "\n" + this.getPreco();
	}
}
