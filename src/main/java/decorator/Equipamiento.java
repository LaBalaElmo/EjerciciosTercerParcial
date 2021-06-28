package decorator;

public class Equipamiento implements IPersonaje {
	private IPersonaje personaje;

	public Equipamiento(IPersonaje personaje) {
		this.personaje = personaje;
	}

	@Override
	public String getNombre() {
		return personaje.getNombre();
	}

	@Override
	public int getNivel() {
		return personaje.getNivel();
	}

	@Override
	public void setNivel(int nivel) {
		personaje.setNivel(nivel);;
	}

	@Override
	public Arma getArma(int position) {
		return personaje.getArma(position);
	}

	@Override
	public void addArma(Arma arma) {
		personaje.addArma(arma);
	}

	@Override
	public int getPorcentajeDeArmadura() {
		return personaje.getPorcentajeDeArmadura();
	}

	@Override
	public void setPorcentajeDeArmadura(int porcentajeDeArmadura) {
		personaje.setPorcentajeDeArmadura(porcentajeDeArmadura);;
	}

	@Override
	public double getPuntosAtaque() {
		return personaje.getPuntosAtaque();
	}

	@Override
	public void setPuntosAtaque(double puntosAtaque) {
		personaje.setPuntosAtaque(puntosAtaque);;
	}

	@Override
	public double getPuntosDefensa() {
		return personaje.getPuntosDefensa();
	}

	@Override
	public void setPuntosDefensa(double puntosDefensa) {
		personaje.setPuntosDefensa(puntosDefensa);;
	}

	@Override
	public double getPuntosRegeneraciónVida() {
		return personaje.getPuntosRegeneraciónVida();
	}

	@Override
	public void setPuntosRegeneraciónVida(double puntosRegeneraciónVida) {
		personaje.setPuntosRegeneraciónVida(puntosRegeneraciónVida);;
	}

	@Override
	public void operation() {
		this.personaje.operation();
	}
}
