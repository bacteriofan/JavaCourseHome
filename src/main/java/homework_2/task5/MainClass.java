
package main.java.homework_2.task5;

import java.util.List;
import java.util.Scanner;
public class MainClass {
    public static void main(String[] args) {
        LogStudentBD Studentbd=new LogStudentBD();
        List<LogStudent> bd=Studentbd.bd();

        System.out.print("Введите студента: ");
        Scanner scan = new Scanner(System.in);
        String StudentV = scan.nextLine();

        SearchOfGroups.Search(bd, StudentV);

    }


}

