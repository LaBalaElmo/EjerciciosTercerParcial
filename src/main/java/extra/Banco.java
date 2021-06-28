package extra;

import java.util.ArrayList;
import java.util.List;

public class Banco implements IBanco {
	public static Banco instance = null;
	private int monto = 0;
	private List<IDueños> list = new ArrayList<>();

	private Banco() {
		System.out.println("Iniciando instancia del banco");
	}

	private synchronized static void makeInstace() {
		if (instance == null)
			instance = new Banco();
	}

	public static Banco getInstance() {
		if (instance == null)
			makeInstace();
		return instance;
	}

	public void cobrar(int monto) {
		setMonto(getMonto() + monto);
		System.out.println("Cobrando por el banco el monto de " + getMonto());
	}

	public void mostrarDineroEnBanco() {
		System.out.println("El monto total disponible en el banco es de " + getMonto());
	}

	public int getMonto() {
		return monto;
	}

	public void setMonto(int monto) {
		this.monto = monto;
	}

	@Override
	public void añadirDirectivo(IDueños observer) {
		list.add(observer);
	}

	@Override
	public void despedirDirectivo(IDueños observer) {
		list.remove(observer);
	}

	@Override
	public void notifyObserver() {
		for (IDueños dueno : list) {
			dueno.update();
		}
	}
}
