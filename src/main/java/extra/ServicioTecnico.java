package extra;

public class ServicioTecnico implements IEmpresa {

	@Override
	public void reparar(Laptop laptop, Banco banco) {
		System.out.println("Reparando con el kit para la laptop, la laptop con las siguientes caracteristicas");
		laptop.showInfo();
		if (laptop.getTamano().toLowerCase().equals("grande")) {
			System.out.println("El costo es de 50 ya que la laptop es grande");
			banco.cobrar(50);
		} else if (laptop.getTamano().toLowerCase().equals("pequeño")) {
			System.out.println("El costo es de 20 ya que la laptop es pequeño");
			banco.cobrar(20);
		}
		banco.notifyObserver();
	}

	@Override
	public void reparar(PC pc, Banco banco) {
		System.out.println("Reparando con el kit para la pc, la pc con las siguientes caracteristicas");
		pc.showInfo();
		if (pc.getTamano().toLowerCase().equals("grande")) {
			System.out.println("El costo es de 200 ya que la pc es grande");
			banco.cobrar(200);
		} else if (pc.getTamano().toLowerCase().equals("pequeño")) {
			System.out.println("El costo es de 120 ya que la pc es pequeño");
			banco.cobrar(120);
		}

		banco.notifyObserver();
	}

	@Override
	public void reparar(Tablet tablet, Banco banco) {
		System.out.println("Reparando con el kit para la tablet, la tablet con las siguientes caracteristicas");
		tablet.showInfo();
		if (tablet.getTamano().toLowerCase().equals("grande")) {
			System.out.println("El costo es de 20  ya que la tablet es grande");
			banco.cobrar(20);
		} else if (tablet.getTamano().toLowerCase().equals("pequeño")) {
			System.out.println("El costo es de 10 ya que la tablet es pequeño");
			banco.cobrar(10);
		}

		banco.notifyObserver();
	}

}
