/**
 * @Author Kseniia Stepanova
 */

package main.java.homework_1.task6_new;

/**
 * Class that contains main method
 */
public class Notepad {
    public static void main(String[] args) {
       Note note1 = new Note();

        note1.addNote("something");
        note1.addNote("something2");
        note1.addNote("something3");
        note1.addNote("something4");

        note1.editNote();

        note1.viewNotes();

        note1.removeNote();

        note1.viewNotes();

        note1.removeAllNotes();

        note1.viewNotes();



    }
}
