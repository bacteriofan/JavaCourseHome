package task2;
import java.util.Scanner;


    public class Task2 {
        public static void main(String[] args) {
            System.out.print("Введите e: ");
            Scanner eScan = new Scanner(System.in);
            double e = eScan.nextDouble();

            System.out.print("Введите n: ");
            Scanner nScan = new Scanner(System.in);
            double n = nScan.nextDouble();


            double m=1/Math.pow((1+n),2);
            while (m>e){
                System.out.println ("Значение а(" + n+")="+m);
                n+=1;
                m=1/Math.pow((1+n),2);
            }
        }
    }

