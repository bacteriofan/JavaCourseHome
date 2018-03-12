package task4;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Введите размер массива: ");

        int size = input.nextInt();
        int array[] = new int[size];

        System.out.println("Введите эелементы массива:");

        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt(); // Заполняем массив элементами, введёнными с клавиатуры
        }



        int max = array[0] + array[size];
        for (int i = 1; i < size-1; i++) {
            int curr = array[i] + array[i+1];
            if (curr > max) max = curr;

        }
        System.out.println ("Значение max = "+max);
    }
}


