package adapter;

import java.util.ArrayList;
import java.util.List;

public class AppWindowsPhone implements IEmpresa1 {
	private List<Usuario> list = new ArrayList<>();

	@Override
	public void login(Usuario user) {
		if (list.contains(user)) {
			System.out.println("Sesion de " + user.getUser() + " ya esta iniciada en la app de Windows Phone");
		} else {
			list.add(user);
			System.out.println("Usuario " + user.getUser() + " logeado en la app de Windows Phone");
		}
	}

	@Override
	public void logout(Usuario user) {
		if (!list.contains(user)) {
			System.out.println("La sesion de " + user.getUser() + " ya esta cerrada en la app de Windows Phone");
		} else {
			list.remove(user);
			System.out.println("Logout exitoso por el usuario " + user.getUser() + " en la app de Windows Phone");
		}

	}

	@Override
	public void reportes(Usuario user) {
		System.out.println("Reporte del usuario " + user.getUser() + " en la app de Windows Phone");
		user.datos();

	}

}
