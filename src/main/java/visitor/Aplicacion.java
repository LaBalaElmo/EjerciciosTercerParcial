package visitor;

import java.util.Random;

public class Aplicacion implements IAplicacion {

	@Override
	public void recomendarMantenimiento(Celular celular) {
		celular.showInfo();
		System.out.println("Es necesario un mantenimiento preventivo para el celular");
	}

	@Override
	public void recomendarMantenimiento(Computadora computadora) {
		int aux = new Random().nextInt(100);
		System.out.println("Evaluando la computadora para ver que mantenimiento necesita");
		if (aux % 2 == 0) {
			System.out.println("Es necesario un mantenimiento preventivo para la computadora");
		} else {
			System.out.println("Es necesario un mantenimiento correctivo para la computadora");
		}
	}

	@Override
	public void recomendarMantenimiento(Televisor televisor) {
		System.out.println("Imprimiendo caracteristicas");
		televisor.showInfo();

	}

}
