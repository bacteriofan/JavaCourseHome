
package main.java.homework_2.task2;

import java.util.Scanner;

    public class ClassMain {
        public  static void main(String[] args) {

            EmployeeBD EmployeeBD=new EmployeeBD();


            System.out.print("Введите сотрудника: ");
            Scanner scan = new Scanner(System.in);
            String sotrudnik = scan.nextLine();

            CostOfStationery CostOfStationery=new CostOfStationery();
            System.out.print("У сотрудника " + sotrudnik+" канцелярских товаров на " + CostOfStationery.sum(EmployeeBD.bd(),sotrudnik));

        }
    }
