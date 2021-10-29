package Menento;

/***
 * @author syq
 * @description It is responsible for the call of Memento
 */
public class Caretaker {
    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
    private Memento memento;

}
