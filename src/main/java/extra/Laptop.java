package extra;

public class Laptop implements IComputadora {
	private String marca;
	private String so;
	private int imei;
	private String nombre;
	private String tamano;

	public Laptop(String marca, String so, int imei, String nombre, String tamano) {
		this.marca = marca;
		this.so = so;
		this.imei = imei;
		this.nombre = nombre;
		this.tamano = tamano;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getSo() {
		return so;
	}

	public void setSo(String so) {
		this.so = so;
	}

	public int getImei() {
		return imei;
	}

	public void setImei(int imei) {
		this.imei = imei;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public void reparar(IEmpresa app, Banco banco) {
		app.reparar(this, banco);

	}

	@Override
	public void showInfo() {
		System.out.println("Marca: " + marca);
		System.out.println("Sistema operativo: " + so);
		System.out.println("Codigo imei: " + imei);
		System.out.println("Nombre del propetario: " + nombre);

	}

	public String getTamano() {
		return tamano;
	}

	public void setTamano(String tamano) {
		this.tamano = tamano;
	}

}
