
public class Boleto implements TipoPagamento {

	@Override
	public void pagar(double valor) {
		System.out.println("Pagamento em boleto. Valor da taxa fixa R$ 0,80 centavos.");
	}
}
