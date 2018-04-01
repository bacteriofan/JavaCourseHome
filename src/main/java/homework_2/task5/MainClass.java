
package main.java.homework_2.task5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class MainClass {
    public static void main(String[] args) {
        LogStudentBD Studentbd=new LogStudentBD();
        List<LogStudent> bd=Studentbd.bd();

        System.out.print("Введите студента: ");
        Scanner scan = new Scanner(System.in);
        String StudentV = scan.nextLine();

        List<String> ctr=new ArrayList<String>();

        ctr.addAll(SearchOfGroups.Search(bd, StudentV));


        for (Object stroka: ctr) {
            //stroka.getClass();
            System.out.println(stroka);}


    }


}

