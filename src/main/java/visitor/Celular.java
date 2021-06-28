package visitor;

public class Celular implements IComponentes {
	private String so;
	private String marca;
	private int imei;

	public Celular(String so, String marca, int imei) {
		this.so = so;
		this.marca = marca;
		this.imei = imei;
	}

	public String getSo() {
		return so;
	}

	public void setSo(String so) {
		this.so = so;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getImei() {
		return imei;
	}

	public void setImei(int imei) {
		this.imei = imei;
	}

	@Override
	public void solicitarRevision(IAplicacion app) {
		app.recomendarMantenimiento(this);

	}

	@Override
	public void showInfo() {
		System.out.println("Sistema operativo: " + so);
		System.out.println("Marca: " + marca);
		System.out.println("Codigo imei: " + imei);
	}

}
