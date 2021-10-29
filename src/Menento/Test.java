package Menento;

import javax.swing.text.Caret;

/***
 * Test
 */
public class Test {
    public static void main(String[] args) {
        Runner runner=new Runner(0,"Jack");
        runner.Show();
        Caretaker caretaker=new Caretaker();
        caretaker.setMemento(runner.createMemento());
        runner.setName("Peter");
        runner.setTime(11.1);
        runner.Show();
        runner.restoreMemento(caretaker.getMemento());
        runner.Show();

    }
}
