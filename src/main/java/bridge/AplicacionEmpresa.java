package bridge;

public class AplicacionEmpresa implements IFormaPago {
	private double descuento = 0.10;
	private String tipo = "la aplicacion de la empresa";

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
