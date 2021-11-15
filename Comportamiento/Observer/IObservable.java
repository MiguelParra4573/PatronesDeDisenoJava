package Comportamiento.Observer;

public interface IObservable {
    void addObserver(IObserver o);
    void notificarObservadores();
    void removeObservadores();
}
