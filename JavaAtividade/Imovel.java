package JavaAtividade;

public class Imovel {
	//Attribute
	private String endereco;
	private Double preco;
	public String nome;
	
	//Constructors
	public Imovel(){}
	public Imovel(String endereco, Double preco) {
		this.endereco = endereco;
		this.preco = preco;
	}
	public Imovel(String endereco, Double preco, String nome) {
		this(endereco, preco);
		this.nome = nome;
	}
	
	//Setters
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public void setPreco(Double preco) {
		this.preco = preco;
	}
	
	//Getters
	public String getEndereco() {
		return endereco;
	}
	public Double getPreco() {
		return preco;
	}
	
	//Methods
	public Double consultar() {
		return preco;
	}
	//toString
	public String toString() {
		return this.endereco + "\n" + this.preco;
	}
}
