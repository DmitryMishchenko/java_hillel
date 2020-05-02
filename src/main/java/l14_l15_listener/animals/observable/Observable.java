package l14_l15_listener.animals.observable;

public interface Observable {
    void addObserver(Observer observer);
    void notifyObservers();
}
