
//Herda os atributos e m�todos da classe pai
public class ClientePJ extends Cliente{

	private String cnpj;//pro�be qualquer acesso externo � pr�pria classe, inclusive das classes filhas
	
	//M�todo construtor da classe
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
