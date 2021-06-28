package adapter;

public class Client {
	public static void main(String[] args) {
		AppWeb app1 = new AppWeb();
		AppEscritorio app2 = new AppEscritorio();

		AppAndroid app3 = new AppAndroid();

		Usuario user = new Usuario("Jose", "joselito", 785269);

		app1.iniciarSesion(user);
		app1.cerrarSesion(user);
		app1.generacionDeDatos(user);

		app2.iniciarSesion(user);
		app2.cerrarSesion(user);
		app2.generacionDeDatos(user);

		AppEmpresa2Adaptado androidAdaptado = new AppEmpresa2Adaptado(app3);
		
		androidAdaptado.iniciarSesion(user);
		androidAdaptado.cerrarSesion(user);
		androidAdaptado.generacionDeDatos(user);
	}
}
