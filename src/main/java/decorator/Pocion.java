package decorator;

public class Pocion extends Equipamiento {

	public Pocion(IPersonaje personaje) {
		super(personaje);
	}

	@Override
	public void operation() {
		super.setPuntosRegeneraci�nVida(super.getPuntosRegeneraci�nVida()*0.8 + super.getPuntosRegeneraci�nVida());
		super.operation();
	}

}
