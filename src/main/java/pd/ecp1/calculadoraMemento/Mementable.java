package pd.ecp1.calculadoraMemento;

public interface Mementable<T> {
    T createMemento();

    void restoreMemento(T memento);

}
