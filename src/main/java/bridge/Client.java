package bridge;

public class Client {
	public static void main(String[] args) {
		IEmpresa agua = new InstalacionAgua("Juan Perez", 7315965);
		agua.cobrarPorServicio(new Presencial(), 50);
		
		agua.cobrarPorServicio(new AplicacionEmpresa(), 80);
		
		IEmpresa electricidad = new InstalacionElectrica("Jose Gimenez", 7315965);
		
		electricidad.cobrarPorServicio(new TransferenciaBancaria(), 105);
		
		IEmpresa alcantarillado = new InstalacionAlcantarillado("Jose Gimenez", 7315965);
		alcantarillado.cobrarPorServicio(new TigoMoney(), 10);
	}
}
