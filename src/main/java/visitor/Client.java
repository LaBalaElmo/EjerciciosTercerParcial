package visitor;

public class Client {
	public static void main(String[] args) {
		Celular celular = new Celular("Android", "Sony", 356982145);
		Computadora computadora = new Computadora("HP", "Windows", 1024);
		Televisor televisor = new Televisor("Samsung", true, 65);
		
		Aplicacion app = new Aplicacion();
		
		celular.solicitarRevision(app);
		computadora.solicitarRevision(app);
		televisor.solicitarRevision(app);
	}
}
