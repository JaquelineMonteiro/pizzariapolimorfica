
public class Dinheiro implements TipoPagamento {

	@Override
	public void pagar(double valor) {
		System.out.println("Pagamento em dinheiro n�o tem acr�scimo!");
	}
}
