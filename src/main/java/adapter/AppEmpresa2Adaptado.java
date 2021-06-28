package adapter;

public class AppEmpresa2Adaptado implements IEmpresa2 {
	private IEmpresa1 app;

	public AppEmpresa2Adaptado(IEmpresa1 app) {
		this.app = app;
	}

	public IEmpresa1 getApp() {
		return app;
	}

	public void setApp(IEmpresa1 app) {
		this.app = app;
	}

	@Override
	public void iniciarSesion(Usuario user) {
		System.out.println("Adaptando a la empresa2");
		app.login(user);

	}

	@Override
	public void cerrarSesion(Usuario user) {
		System.out.println("Adaptando a la empresa2");
		app.logout(user);

	}

	@Override
	public void generacionDeDatos(Usuario user) {
		System.out.println("Adaptando a la empresa2");
		app.reportes(user);

	}

}
