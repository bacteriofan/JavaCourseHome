

package main.java.homework_1.task2;
import java.util.Scanner;


    public class Task2 {
        public static void main(String[] args) {
            System.out.print("Введите любое дробное число меньше или равно 0,25: ");
            Scanner eScan = new Scanner(System.in);
            double e = eScan.nextDouble();

            int n=1;

            double m=1/Math.pow((1+n),2);
            while (m>e){
                System.out.println ("Значение а(" + n+")="+m);
                System.out.println ("Наименьший номер элемента последовательности=" + (n-1));
                n++;
                m=1/Math.pow((1+n),2);

            }
        }
    }

