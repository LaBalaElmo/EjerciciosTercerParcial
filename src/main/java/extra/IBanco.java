package extra;

public interface IBanco {
	void añadirDirectivo(IDueños observer);
    void despedirDirectivo(IDueños observer);
    void notifyObserver();
}
