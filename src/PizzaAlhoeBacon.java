
public class PizzaAlhoeBacon implements Pizza {

	@Override
	public void preparar() {
		System.out.println("Molho, queijo, alho e muito bacon.");

	}

	@Override
	public void assar() {
		System.out.println("14 minutos.");

	}

	@Override
	public void cobrar() {
		System.out.println("R$ 15,50");

	}

}
