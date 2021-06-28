package visitor;

public class Computadora implements IComponentes {
	private String marca;
	private String so;
	private int memoria;

	public Computadora(String marca, String so, int memoria) {
		this.marca = marca;
		this.so = so;
		this.memoria = memoria;
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

	public int getMemoria() {
		return memoria;
	}

	public void setMemoria(int memoria) {
		this.memoria = memoria;
	}

	@Override
	public void solicitarRevision(IAplicacion app) {
		app.recomendarMantenimiento(this);
	}

	@Override
	public void showInfo() {
		System.out.println("Marca: " + marca);
		System.out.println("Sistema operativo: " + so);
		System.out.println("Memoria: " + memoria + " Gb");

	}

}
