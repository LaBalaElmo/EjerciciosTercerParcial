package extra;

public class Contabilidad implements IDueños {
	private String nombre;
	private int ci;
	private String carga = "contabilidad";

	public Contabilidad(String nombre, int ci) {
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

	public String getCarga() {
		return carga;
	}

	public void setCarga(String carga) {
		this.carga = carga;
	}

	@Override
	public void update() {
		System.out.println("----------NOTIFICACIO----------");
		System.out.println("Notificacion recibida por el encargado de " + getCarga() + " de nombre " + getNombre());
		System.out.println("Con cedula de identificacion " + getCi());
	}

}
