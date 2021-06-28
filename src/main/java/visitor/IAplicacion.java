package visitor;

public interface IAplicacion {
	void recomendarMantenimiento(Celular celular);

	void recomendarMantenimiento(Computadora computadora);

	void recomendarMantenimiento(Televisor televisor);
}
