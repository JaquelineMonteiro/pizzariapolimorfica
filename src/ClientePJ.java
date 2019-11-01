
//Herda os atributos e métodos da classe pai
public class ClientePJ extends Cliente{

	private String cnpj;//proíbe qualquer acesso externo à própria classe, inclusive das classes filhas
	
	//Método construtor da classe
	public ClientePJ(String nome, String endereco, String cnpj) {
		super(nome, endereco);
		this.cnpj=cnpj;
	}
	
	//Getters and Setters
	public String getCnpj() {
		return cnpj;
	}
	
	public void setCnpj(String cnpj) {
		this.cnpj=cnpj;
	}
	
}
