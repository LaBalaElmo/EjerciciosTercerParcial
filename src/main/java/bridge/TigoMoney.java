package bridge;

public class TigoMoney implements IFormaPago {
	private double descuento = 0.02;
	private String tipo = "Tigo money";

	@Override
	public double getDescuento() {
		return descuento;
	}

	@Override
	public void showPrecio(double precio) {
		System.out.println("El costo total del servicio es de " + (precio - (precio * descuento)));
	}

	@Override
	public String getTipo() {
		return tipo;
	}

}
