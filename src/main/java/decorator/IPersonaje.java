package decorator;

public interface IPersonaje {
	void operation();

	public String getNombre();

	public int getNivel();

	public void setNivel(int nivel);

	public Arma getArma(int position);

	public void addArma(Arma arma);

	public int getPorcentajeDeArmadura();

	public void setPorcentajeDeArmadura(int porcentajeDeArmadura);

	public double getPuntosAtaque();

	public void setPuntosAtaque(double puntosAtaque);

	public double getPuntosDefensa();

	public void setPuntosDefensa(double puntosDefensa);

	public double getPuntosRegeneraciónVida();

	public void setPuntosRegeneraciónVida(double puntosRegeneraciónVida);
}
