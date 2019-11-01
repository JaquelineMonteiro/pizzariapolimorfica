
public class CartaoCredito implements TipoPagamento {

	@Override
	public void pagar(double valor) {
		double taxa = valor * 0.2;
		System.out.println("Pagamento em cartão de crédito. Valor da taxa é R$ " + taxa);

	}

}
