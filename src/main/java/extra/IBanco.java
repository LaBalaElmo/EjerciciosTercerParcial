package extra;

public interface IBanco {
	void a�adirDirectivo(IDue�os observer);
    void despedirDirectivo(IDue�os observer);
    void notifyObserver();
}
