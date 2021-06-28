package extra;

public class Client {
	public static void main(String[] args) {
		Laptop laptop = new Laptop("HP", "Windows 10", 35698256, "Jose", "Grande");
		PC pc = new PC("DELL", "Windows 10", 35698789, "Carlos", "pequeño");
		Tablet tablet = new Tablet("Samsung", "Android", 356982145, "Jaime", "grande");

		ServicioTecnico servicio = new ServicioTecnico();

		Banco banco = Banco.getInstance();

		Presidente presidente = new Presidente("Gabriel", 789526);
		Vicepresidente vice = new Vicepresidente("Sergio", 6589632);
		Contabilidad contabilidad = new Contabilidad("Pedro", 6398524);
		banco.añadirDirectivo(presidente);
		banco.añadirDirectivo(vice);
		banco.añadirDirectivo(contabilidad);

		
		Thread thread1 = new Thread(new Runnable() {
			@Override
			public void run() {
				Banco banco1 = Banco.getInstance();
				laptop.reparar(servicio, banco1);
			}
		});

		Thread thread2 = new Thread(new Runnable() {
			@Override
			public void run() {
				Banco banco2 = Banco.getInstance();
				pc.reparar(servicio, banco2);
			}
		});

		Thread thread3 = new Thread(new Runnable() {
			@Override
			public void run() {
				Banco banco3 = Banco.getInstance();
				tablet.reparar(servicio, banco3);
			}
		});

		thread1.start();
		thread2.start();
		thread3.start();
		
		try {
			Thread.sleep(300);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		banco.mostrarDineroEnBanco();
	}
}
