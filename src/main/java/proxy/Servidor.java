package proxy;

public class Servidor implements IWeb {
	private String ip;
	private String direccion;
	private String nombre;

	public Servidor(String ip, String direccion, String nombre) {
		this.ip = ip;
		this.direccion = direccion;
		this.nombre = nombre;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public void login(Usuario usuario, String user, String password) {
		System.out.println("Entrando al servidor " + nombre + " de direccion " + direccion + " on ip " + ip);
		usuario.login(this);
		usuario.info();
	}

}
