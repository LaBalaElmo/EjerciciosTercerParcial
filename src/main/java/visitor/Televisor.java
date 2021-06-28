package visitor;

public class Televisor implements IComponentes {
	private String marca;
	private boolean smart;
	private int pantalla;

	public Televisor(String marca, boolean smart, int pantalla) {
		this.marca = marca;
		this.smart = smart;
		this.pantalla = pantalla;
	}

	public boolean isSmart() {
		return smart;
	}

	public void setSmart(boolean smart) {
		this.smart = smart;
	}

	public int getPantalla() {
		return pantalla;
	}

	public void setPantalla(int pantalla) {
		this.pantalla = pantalla;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	@Override
	public void solicitarRevision(IAplicacion app) {
		app.recomendarMantenimiento(this);
	}

	@Override
	public void showInfo() {
		System.out.println("Marca: " + marca);
		System.out.println("Es smart: " + smart);
		System.out.println("Tamaña de la pantalla: " + pantalla + " pulgadas");

	}

}
