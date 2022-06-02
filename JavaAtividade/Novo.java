package JavaAtividade;

public class Novo extends Imovel{
	public Novo(){}
	public Novo(String endereco, Double preco) {
		super(endereco, preco);
	}
	public Novo(String endereco, Double preco, String nome) {
		this(endereco, preco);
		this.nome = nome;
	}
	@Override
	public Double consultar() {
		return getPreco() + (getPreco()*0.5);
	}
	//toString
	public String toString() {
		return this.getEndereco() + "\n" + this.getPreco();
	}
}
