package bridge;

public interface IFormaPago {
	double getDescuento();

	void showPrecio(double precio);
	
	String getTipo();
}
