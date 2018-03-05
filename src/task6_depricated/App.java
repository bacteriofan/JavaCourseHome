package task6_depricated;

public class App extends Notepad {

    public static void main(String[] args)  {


        // создаем новый блокнот
        Notepad newNotepad = new Notepad();


        System.out.println("Спасиб, что открылили наш блокнот!");


            // добавляем запись в созданный блокнот
            newNotepad.addRecord();


            // основная логика - что можно сделать в блокноте
            String enteredOption = newNotepad.selectOption();
            while (!enteredOption.equals("Закончить")) {

                if (enteredOption.contains("Добавить")) {
                    newNotepad.addRecord();
                    newNotepad.selectOption();

                }
                if (enteredOption.contains("Редактировать")) {
                    newNotepad.editRecord();
                    newNotepad.selectOption();

                }

                if (enteredOption.contains("Удалить")) {
                    newNotepad.deleteRecord();
                    newNotepad.selectOption();

                }

                if (enteredOption.contains("Посмотреть")) {
                    newNotepad.getInfo();
                    newNotepad.selectOption();
                }



            }
            System.out.println("Приложение завершило работу. Ждем вас снова!");

        }

    }
