
//Herda os atributos e métodos da classe pai
public class ClientePF extends Cliente{

	private String cpf;//proíbe qualquer acesso externo à própria classe, inclusive das classes filhas
	
	//Método construtor da classe
	public ClientePF(String nome, String endereco, String cpf) {
		super(nome, endereco);
		this.cpf=cpf;
	}
	
	//Getters and Setters
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf=cpf;
	}
}
