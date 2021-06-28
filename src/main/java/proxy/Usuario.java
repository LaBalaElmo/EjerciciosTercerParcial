package proxy;

public class Usuario {
	private String nombre;
	private String user;
	private String password;

	public Usuario(String nombre, String user, String password) {
		this.nombre = nombre;
		this.user = user;
		this.password = password;
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void info() {
		System.out.println("Mostrando datos del usuario");
		System.out.println("Nombre: " + nombre);
		System.out.println("Usuario: " + user);
	}

	public void login(Servidor servidor) {
		System.out.println("El usuario " + getUser() + " ingreso al " + servidor.getIp() + " servidor correctamente");
	}

}
