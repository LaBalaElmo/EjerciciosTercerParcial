package adapter;

import java.util.ArrayList;
import java.util.List;

public class AppWeb implements IEmpresa2 {
	private List<Usuario> list = new ArrayList<>();

	@Override
	public void iniciarSesion(Usuario user) {
		if (list.contains(user)) {
			System.out.println("Sesion de " + user.getUser() + " ya esta iniciada en la app web");
		} else {
			list.add(user);
			System.out.println("Iniciando sesion por el usuario " + user.getUser() + " en la app web");
		}
	}

	@Override
	public void cerrarSesion(Usuario user) {
		if (!list.contains(user)) {
			System.out.println("La sesion de " + user.getUser() + " ya esta cerrada en la app web");
		} else {
			list.remove(user);
			System.out.println("Cerrando sesion por el usuario " + user.getUser() + " en la app web");
		}
	}

	@Override
	public void generacionDeDatos(Usuario user) {
		System.out.println("Generando datos del usuario " + user.getUser() + " en la app web");
		user.datos();

	}

}
