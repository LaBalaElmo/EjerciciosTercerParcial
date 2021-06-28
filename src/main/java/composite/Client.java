package composite;

public class Client {
	public static void main(String[] args) {
		CompositeAlmacenamiento folder1 = new CompositeAlmacenamiento("folder1");
		folder1.add(new Archivo("archivo1", 50));
		folder1.add(new Archivo("archivo2", 85));
		folder1.add(new Archivo("archivo3", 73));
		folder1.add(new Archivo("archivo4", 259));
		
		CompositeAlmacenamiento folder2 = new CompositeAlmacenamiento("folder2");
		folder2.add(new Archivo("archivo5", 10));
		folder2.add(new Archivo("archivo6", 29));
		folder2.add(new Archivo("archivo7", 46));
		folder2.add(new Archivo("archivo8", 100));
		
		CompositeAlmacenamiento unidadDisco = new CompositeAlmacenamiento("Unidad de disco");
		unidadDisco.add(folder1);
		unidadDisco.add(folder2);
		
		unidadDisco.operation();
		
		folder1.operation();
		unidadDisco.operation();
	}
}
