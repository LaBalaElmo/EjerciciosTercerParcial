package bridge;

public class TransferenciaBancaria implements IFormaPago {
	private double descuento = 0.05;
	private String tipo = "transferencia bancaria";

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
