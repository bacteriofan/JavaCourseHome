
package main.java.homework_1.task3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner hValue = new Scanner(System.in);
        Scanner aValue = new Scanner(System.in);
        Scanner bValue = new Scanner(System.in);

        System.out.println("Введите h:");
        while (!hValue.hasNextInt()) {
            System.out.println("Вы ввели неверное значение. Попробуйте снова");
            hValue.next();
        }
        int h = hValue.nextInt();


        System.out.println("Введите a:");
        while (!aValue.hasNextInt()){
            System.out.println("Вы ввели неверное значение. Попробуйте снова");
            aValue.next();
        }
        int a = aValue.nextInt();


        System.out.println("Введите b:");
        while (!bValue.hasNextInt()) {
            System.out.println("Вы ввели неверное значение. Попробуйте снова");
            bValue.next();
        }
        int b = bValue.nextInt();


        if (a < b && h > 0) {

            while (a < b) {

                double f;

                f=Math.tan(2*a)-3;

                System.out.println ("Значение F(" + a+")="+f);

                a = a + h;
            }

        }
        else
            System.out.println("Данные преобразования нельзя провести с введенными числами");
    }

}
