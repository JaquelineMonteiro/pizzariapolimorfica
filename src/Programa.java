
public class Programa {

	public static void main(String[] args) {
		Forno forno = new Forno();	
		Venda venda = new Venda();	
		ClientePF clientepf1 = new ClientePF("\nJaqueline","xxxxxxx ","102.030.867-24");
		ClientePJ clientepj1 = new ClientePJ("LIQ Corp","Mayrink da Veiga ","025.743/0001-79");
		
		forno.fabricar(new PizzaCalabreza());
		forno.fabricar(new PizzaNapolitana());	
		forno.fabricar(new PizzaMozzarella());
		forno.fabricar(new PizzaAlhoeBacon());	
		
		venda.vender(new CartaoCredito(), 100.00);
		venda.vender(new Dinheiro(), 100.00);
		venda.vender(new Boleto(), 100.00);			
		
		System.out.println(clientepf1.getNome() + " " + clientepf1.endereco + clientepf1.getCpf());
		System.out.println(clientepj1.getNome() + " " + clientepj1.endereco + clientepj1.getCnpj());
	}
}