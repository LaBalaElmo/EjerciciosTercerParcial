package proxy;

public class Client {
	public static void main(String[] args) {
		Proxy web = new Proxy();
		Usuario usuario1 = new Usuario("Jose", "joselito123", "pato123");
		web.login(usuario1, "joselito123", "pato123");

		Usuario usuario2 = new Usuario("Pepe", "pepe", "12345");
		Usuario usuario3 = new Usuario("Juan", "juanito", "78945");
		Usuario usuario4 = new Usuario("Carlos", "crlos", "562314");
		Usuario usuario5 = new Usuario("Alex", "alan", "963852r");

		web.login(usuario2, "pepe", "12345");
		web.login(usuario3, "juanito", "78945");
		web.login(usuario4, "crlos", "562314");
		web.login(usuario5, "alan", "963852r");
		web.login(usuario1, "crlos", "pato123");
	}
}
