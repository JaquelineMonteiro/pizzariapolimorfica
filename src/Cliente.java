
public class Cliente {
	
	protected String nome;//permite acesso �s classes filhas, mas pro�be a qualquer outro acesso externo
	protected String endereco;
	
	//m�todo construtor da classe
	public Cliente(String nome, String endereco) {
		this.nome=nome;
		this.endereco=endereco;
	}
	
	//Getters and Setters
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome=nome;
	}
	
	public String getEndereco() {
		return endereco;
	}	
	
	public void setEndereco(String endereco) {
		this.endereco=endereco;
	}
}
