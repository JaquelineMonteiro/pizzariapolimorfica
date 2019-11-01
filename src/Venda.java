
public class Venda {

	public void vender(TipoPagamento pgto, double valor) {
		pgto.pagar(valor);
	}
}
