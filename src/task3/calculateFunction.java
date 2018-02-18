package task3;

import java.util.Scanner;

public class calculateFunction {
    public static void main(String[] args) {
        Scanner hValue = new Scanner(System.in);
        Scanner aValue = new Scanner(System.in);
        Scanner bValue = new Scanner(System.in);

        System.out.println("Введите h:");
        int h = hValue.nextInt();

        System.out.println("Введите a:");
        int a = aValue.nextInt();

        System.out.println("Введите b:");
        int b = bValue.nextInt();

        if (a != b & a < b & h > 0) {

            while (a < b) {
                int function1;
                function1 = a - 3;

                int functionValue;
                functionValue = b + 5;

                System.out.print("Функция:" + function1 + " ");
                System.out.print("Значение функции:" + functionValue + "\n");

                a = a + h;
            }

        }
        else
            System.out.println("Вы ввели неверные числа");
    }


}
