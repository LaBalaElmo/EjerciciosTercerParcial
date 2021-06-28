package bridge;

public class InstalacionElectrica implements IEmpresa {
	private String nombre;
	private int ci;

	public InstalacionElectrica(String nombre, int ci) {
		this.nombre = nombre;
		this.ci = ci;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCi() {
		return ci;
	}

	public void setCi(int ci) {
		this.ci = ci;
	}

	@Override
	public void cobrarPorServicio(IFormaPago forma, int costo) {
		System.out.println("Cobrando por la instalacion electrica");
		System.out.println(nombre + " con ci de " + ci + " pago con " + forma.getTipo());
		forma.showPrecio(costo);
	}
}
