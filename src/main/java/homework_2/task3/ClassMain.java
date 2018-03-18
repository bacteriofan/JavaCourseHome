
package main.java.homework_2.task3;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class ClassMain {
    public  static void main(String[] args) {

        EmployeeBD EmployeeBD=new EmployeeBD();

        Set Employees =  EmployeeBD.bd();

        List OfficeAtTheEmployeeC1= new ArrayList();
        List SetOfTheBeginner=new ArrayList();

        NewEmployee c1=new NewEmployee("Шапкин", "Директор", OfficeAtTheEmployeeC1,SetOfTheBeginner);
        c1.setOfficeAtTheEmployee(new Pen("Ручка",22.3,"Германия","Шариковая"));
        c1.setOfficeAtTheEmployee(new Notebooks("Блокнот",50.5,"Греция","Твердый"));
        c1.setOfficeAtTheEmployee(new Paper("Папка",22.3,"Германия",500));



        System.out.println("Набор новечка "+c1.getName());
        for (Object stroka: SetOfTheBeginner) {
            stroka.getClass();
            System.out.println(stroka);

        }

    }
}
