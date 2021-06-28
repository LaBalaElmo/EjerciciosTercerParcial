package decorator;

public class Pocion extends Equipamiento {

	public Pocion(IPersonaje personaje) {
		super(personaje);
	}

	@Override
	public void operation() {
		super.setPuntosRegeneraciónVida(super.getPuntosRegeneraciónVida()*0.8 + super.getPuntosRegeneraciónVida());
		super.operation();
	}

}
