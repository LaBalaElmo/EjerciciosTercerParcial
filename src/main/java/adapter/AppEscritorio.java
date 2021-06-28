package adapter;

import java.util.ArrayList;
import java.util.List;

public class AppEscritorio implements IEmpresa2 {
	private List<Usuario> list = new ArrayList<>();

	@Override
	public void iniciarSesion(Usuario user) {
		if (list.contains(user)) {
			System.out.println("Sesion de " + user.getUser() + " ya esta iniciada en la app de escritorio");
		} else {
			list.add(user);
			System.out.println("Iniciando sesion por el usuario " + user.getUser() + " en la app de escritorio");
		}
	}

	@Override
	public void cerrarSesion(Usuario user) {
		if (!list.contains(user)) {
			System.out.println("La sesion de " + user.getUser() + " ya esta cerrada en la app de escritorio");
		} else {
			list.remove(user);
			System.out.println("Cerrando sesion por el usuario " + user.getUser() + " en la app de escritorio");
		}
	}

	@Override
	public void generacionDeDatos(Usuario user) {
		System.out.println("Generando datos del usuario " + user.getUser() + " en la app de escritorio");
		user.datos();

	}

}
