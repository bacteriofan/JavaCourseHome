
package main.java.homework_2.task4;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class EmployeeBD {

    public  Set bd(){


        Set Employees=new HashSet();

        List OfficeAtTheEmployeeC1= new ArrayList();
        Employee c1=new Employee("Иванов", "Директор", OfficeAtTheEmployeeC1);
        c1.setOfficeAtTheEmployee(new Pen("Ручка",22.3,"Германия","Шариковая"));
        c1.setOfficeAtTheEmployee(new Notebooks("Блакнот",50.5,"Греция","Твердый"));
        c1.setOfficeAtTheEmployee(new Paper("Бумага",22.3,"Германия",500));
        Employees.add(c1);
        List OfficeAtTheEmployeeС2= new ArrayList();
        Employee c2=new Employee("Темофеев", "Бух", OfficeAtTheEmployeeС2);
        c2.setOfficeAtTheEmployee(new Pen("Ручка",32.3,"Германия","Геливая"));
        c2.setOfficeAtTheEmployee(new Notebooks("Тетрадь",50.5,"Иран","Мягкий переплет"));
        c2.setOfficeAtTheEmployee(new Paper("Бумага",22.3,"Германия",100));
        Employees.add(c2);
        List OfficeAtTheEmployeeС3= new ArrayList();
        Employee c3=new Employee("Рудаков", "Бух", OfficeAtTheEmployeeС3);
        c3.setOfficeAtTheEmployee(new Pen("Ручка",5.3,"Турция","Геливая"));
        c3.setOfficeAtTheEmployee(new Notebooks("Тетрадь",40.5,"Иран","Мягкий переплет"));
        c3.setOfficeAtTheEmployee(new Paper("Бумага",22.3,"Германия",10));
        Employees.add(c3);


        return Employees;


    }
}
