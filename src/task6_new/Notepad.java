package task6_new;

import java.util.ArrayList;

public class Notepad {
    public static void main(String[] args) {
       Note note1 = new Note();
       note1.setNote("something");


       ArrayList Notepad = new ArrayList();
       Notepad.add(note1.getNote());


        for (int i = 0; i < Notepad.size(); i++) {
            String content = Notepad.get(i) + " ";
            System.out.println(content);
        }

    }
}
