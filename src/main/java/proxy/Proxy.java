package proxy;

import java.util.ArrayList;
import java.util.List;

public class Proxy implements IWeb {
	private List<Usuario> usuarios;
	private Servidor servidor1 = new Servidor("192.168.26.3", "www.servidor1.com", "servidor1");
	private Servidor servidor2 = new Servidor("192.15.2.3", "www.servidor2.com", "servidor2");

	public Proxy() {
		usuarios = new ArrayList<>();
	}

	public List<Usuario> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}

	@Override
	public void login(Usuario usuario, String user, String password) {
		if (usuario.getUser().equals(user) && usuario.getPassword().equals(password)) {
			usuarios.add(usuario);
			if (usuarios.size() % 2 != 0) {
				servidor1.login(usuario, user, password);
			} else {
				servidor2.login(usuario, user, password);
			}
		} else {
			if (!usuario.getUser().equals(user)) {
				System.out.println("El usurio de " + usuario.getNombre() + " es incorrecto");
			}

			if (!usuario.getPassword().equals(password)) {
				System.out.println("El password de " + usuario.getNombre() + " es incorrecto");
			}
		}
	}

}
