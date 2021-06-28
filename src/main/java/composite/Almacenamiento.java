package composite;

public abstract class Almacenamiento {
	private String tipo;
	private int palabras;

	public Almacenamiento(String tipo, int palabras) {
		this.tipo = tipo;
		this.palabras = palabras;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getPalabras() {
		return palabras;
	}

	public void setPalabras(int palabras) {
		this.palabras = palabras;
	}

	public abstract void operation();

	public abstract void add(Almacenamiento almacenamiento);

	public abstract void remove(Almacenamiento almacenamiento);

	public abstract void getChild(int position);
}
