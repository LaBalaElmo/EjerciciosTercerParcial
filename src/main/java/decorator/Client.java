package decorator;

import decorator.Arma.NombreArma;

public class Client {
	public static void main(String[] args) {
		IPersonaje illidan = new CazadorDeDemonios("Illidan");
		
		illidan = new Arma(illidan, NombreArma.HACHA);
		illidan = new Arma(illidan, NombreArma.HACHA);
		
		illidan = new Escudo(illidan);
		
		illidan = new Pocion(illidan);
		illidan.operation();
	}
}
