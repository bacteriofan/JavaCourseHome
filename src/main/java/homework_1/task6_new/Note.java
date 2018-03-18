/**
 * @Author Kseniia Stepanova
 */

package main.java.homework_1.task6_new;

import java.util.ArrayList;
import java.util.Scanner;

public class Note {

    ArrayList Notepad = new ArrayList();

    public Note(){
    }


    /**
     *  Adds new note at the end of an array
     *  @see Note#addNote(String)
     */
    public void addNote(String note) {
        Notepad.add(note);
    }

    /** Asks user to enter a note number and note itself, and then rewrites existed note with entered one
     * @see Note#editNote()
     */
    public void editNote () {
        System.out.println("Введите номер записи, которую хотите отредактирвоать");
        Scanner inIndex = new Scanner(System.in);
        int Index = inIndex.nextInt();

        System.out.println("Отредактируйте запись");
        Scanner inNote = new Scanner(System.in);
        String newNote = inNote.nextLine();
        Notepad.set(Index, newNote);
    }


    /** Asks to enter a note number and removes corresponding note
     * @see Note#removeNote()
     */
    public void removeNote (){
        System.out.println("Введите номер записи, которую хотите удалить");
        Scanner inRemoveIndex = new Scanner(System.in);
        int Index  = inRemoveIndex.nextInt();
        Notepad.remove(Index);
    }

    /** Removes all the notes from the notepad
     * @see Note#removeAllNotes()
     */
    public void removeAllNotes () {
        Notepad.clear();
    }

    /** Displays all the notes in the console
     * @see Note#viewNotes()
     */
    public void viewNotes () {
        for (int i = 0; i < Notepad.size(); i++) {
            String content = Notepad.get(i) + " ";
            System.out.println(content);
        }
    }
}

