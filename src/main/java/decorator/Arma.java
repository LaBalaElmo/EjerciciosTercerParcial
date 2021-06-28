package decorator;

public class Arma extends Equipamiento {

	private static NombreArma nombreArma;

	public Arma(IPersonaje personaje, NombreArma arma) {
		super(personaje);
		super.addArma(this);
		nombreArma = arma;
	}

	public static enum NombreArma {
		ESPADA, HACHA, ESCOPETA
	}

	public String getNombreArma() {
		return nombreArma.toString().toLowerCase();
	}

	public void setNombreArma(NombreArma nombreArma) {
		Arma.nombreArma = nombreArma;
	}

	@Override
	public void operation() {
		super.setPuntosAtaque(super.getPuntosAtaque() * 0.3 + super.getPuntosAtaque());
		super.setNivel(super.getNivel() * 2);
		super.operation();
	}

}
