package decorator;

import java.util.ArrayList;
import java.util.List;

public abstract class Personaje implements IPersonaje {
	private String nombre;
	private int nivel;
	private List<Arma> armas = new ArrayList<>();
	private int porcentajeDeArmadura;
	private double puntosAtaque;
	private double puntosDefensa;
	private double puntosRegeneraciónVida;

	public Personaje(String nombre) {
		this.nombre = nombre;
		this.nivel = 1;
		this.porcentajeDeArmadura = 1;
		this.puntosAtaque = 1;
		this.puntosDefensa = 1;
		this.puntosRegeneraciónVida = 1;
	}

	@Override
	public void operation() {
		System.out.println("Nombre: " + nombre);
		System.out.println("Nivel: " + nivel);
		for (int i = 0; i < armas.size(); i++) {
			System.out.println("Arma" + (i + 1) + ": " + armas.get(0).getNombreArma());
		}
		System.out.println("Porcentaje de armadura: " + porcentajeDeArmadura);
		System.out.println("Puntos de ataque: " + puntosAtaque);
		System.out.println("Puntos de defensa: " + puntosDefensa);
		System.out.println("Puntos de regeneracion de vida: " + puntosRegeneraciónVida);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNivel() {
		return nivel;
	}

	public void setNivel(int nivel) {
		this.nivel = nivel;
	}

	public Arma getArma(int position) {
		return armas.get(position);
	}

	public void addArma(Arma arma) {
		armas.add(arma);
	}

	public int getPorcentajeDeArmadura() {
		return porcentajeDeArmadura;
	}

	public void setPorcentajeDeArmadura(int porcentajeDeArmadura) {
		this.porcentajeDeArmadura = porcentajeDeArmadura;
	}

	public double getPuntosAtaque() {
		return puntosAtaque;
	}

	public void setPuntosAtaque(double puntosAtaque) {
		this.puntosAtaque = puntosAtaque;
	}

	public double getPuntosDefensa() {
		return puntosDefensa;
	}

	public void setPuntosDefensa(double puntosDefensa) {
		this.puntosDefensa = puntosDefensa;
	}

	public double getPuntosRegeneraciónVida() {
		return puntosRegeneraciónVida;
	}

	public void setPuntosRegeneraciónVida(double puntosRegeneraciónVida) {
		this.puntosRegeneraciónVida = puntosRegeneraciónVida;
	}

}
