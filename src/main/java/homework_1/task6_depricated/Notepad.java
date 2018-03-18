package main.java.homework_1.task6_depricated;


import java.util.Scanner;

public class Notepad extends RecordInNotepad {


    public void addRecord() {
        Scanner NewRecord = new Scanner(System.in);
        System.out.println("Введите новую запись");
        String enteredRecord = NewRecord.next();
        records.add(enteredRecord);

    }


    public void getInfo() {

        for (int i = 0; i < records.size(); i++) {

            System.out.println("Список записей:" + records.get(i));

        }

    }


    public void deleteRecord() {
        Scanner Index = new Scanner(System.in);
        System.out.println("Введите порядоквый номер элемента, который вы хотите удалить");
        int enteredIndex = Index.nextInt();
        records.remove(enteredIndex);
    }


    public void editRecord() {
        Scanner Index1 = new Scanner(System.in);
        System.out.println("Введите порядоквый номер элемента, который вы хотите редактировать");
        int enteredIndex1 = Index1.nextInt();


        Scanner NewValue = new Scanner(System.in);
        System.out.println("Введите новую запись");
        String enteredValue = NewValue.next();


        records.set(enteredIndex1, enteredValue);
    }


     String selectOption(){
        Scanner option = new Scanner(System.in);
        System.out.println("Выберете, какое действие вы хотите сделать дальше: добавить запись, удалить запись, редактировать запись");
        String enteredOption = option.next();
        return enteredOption;
    }

    }


