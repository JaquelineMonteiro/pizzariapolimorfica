
//Herda os atributos e m�todos da classe pai
public class ClientePF extends Cliente{

	private String cpf;//pro�be qualquer acesso externo � pr�pria classe, inclusive das classes filhas
	
	//M�todo construtor da classe
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
