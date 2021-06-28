package decorator;

public class Escudo extends Equipamiento {

	public Escudo(IPersonaje personaje) {
		super(personaje);
	}

	@Override
	public void operation() {
		super.setPuntosDefensa(super.getPuntosDefensa() * 0.35 + super.getPuntosDefensa());
		if(super.getPorcentajeDeArmadura()+10  <= 100) {
			super.setPorcentajeDeArmadura(super.getPorcentajeDeArmadura()+10);
		}else {
			System.out.println("Porcentaje de armadura al maximo");
		}
		super.operation();
	}

}
