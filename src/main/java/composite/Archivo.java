package composite;

public class Archivo extends Almacenamiento {

	public Archivo(String tipo, int palabras) {
		super(tipo, palabras);
	}

	@Override
	public void operation() {
		System.out.println("La cantidad de palabras en este " + getTipo() + " es de " + getPalabras());
	}

	@Override
	public void add(Almacenamiento almacenamiento) {
		System.out.println("No se puede añadir cosas a este archivo");
	}

	@Override
	public void remove(Almacenamiento almacenamiento) {
		System.out.println("No se puede remover nada de este archivo");
	}

	@Override
	public void getChild(int position) {
		System.out.println("No se puede completar esta operacion");
	}

}
