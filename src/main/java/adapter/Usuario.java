package adapter;

public class Usuario {
	private String nombre;
	private String user;
	private int ci;

	public Usuario(String nombre, String user, int ci) {
		this.nombre = nombre;
		this.user = user;
		this.ci = ci;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public int getCi() {
		return ci;
	}

	public void setCi(int ci) {
		this.ci = ci;
	}

	public void datos() {
		System.out.println("Nombre: " + nombre);
		System.out.println("Usuario: " + user);
		System.out.println("Cedula de indentidad: " + ci);
	}

}
