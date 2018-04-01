package main.java.homework_2.task6;

import java.util.Scanner;

public class ClassMain {
    public static void main(String[] args) {
        AtomicBoat Boat=new AtomicBoat(0,0);
        Plit Theengine=Boat.creatTheengineFortheAtomicBoat();
        boolean Permission=true;
        while (Permission){
            System.out.println("Текущие координаты X="+Boat.getX()+"Y="+Boat.getY());
            System.out.println("Вперед цифра 6");
            System.out.println("Назад цифра 4");
            System.out.println("Погружение цифра 2");
            System.out.println("Всплытие цифра 8");
            System.out.println("Выключить двигатель цифра 0");

            Scanner scan = new Scanner(System.in);
            int upr = scan.nextInt();
            System.out.println("Укажите расстояние (целое в метрах)");

            int ras = scan.nextInt();

            if(upr==6){
                Theengine.Forward(ras);
            }
            if(upr==4){
                Theengine.Back(ras);
            }
            if(upr==8){
                Theengine.Up(ras);
            }

            if(upr==2){
                Theengine.Down(ras);
            }

            if(upr==0){
                Permission=false;
            }



        }

    }


}
