package composite;

import java.util.ArrayList;
import java.util.List;

public class CompositeAlmacenamiento extends Almacenamiento {
	private List<Almacenamiento> list = new ArrayList<>();

	public CompositeAlmacenamiento(String tipo) {
		super(tipo, 0);
	}

	@Override
	public void operation() {
		System.out.println("Calculando la cantidad de palabras en el " + getTipo());
		this.setPalabras(0);
		if (list.size() > 0 && !(list.get(0) instanceof Archivo)) {
			for (Almacenamiento component : list) {
				component.setPalabras(0);
			}
		}
		for (Almacenamiento component : list) {
			component.operation();
			this.setPalabras(component.getPalabras() + this.getPalabras());
		}
		System.out.println("La cantidad total de palabras de " + getTipo() + " es de " + getPalabras());
	}

	@Override
	public void add(Almacenamiento almacenamiento) {
		list.add(almacenamiento);
	}

	@Override
	public void remove(Almacenamiento almacenamiento) {
		list.remove(almacenamiento);
	}

	@Override
	public void getChild(int position) {
		list.get(position);
	}

}
