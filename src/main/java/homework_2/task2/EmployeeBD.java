

package main.java.homework_2.task2;

import java.util.*;

public class EmployeeBD {

    public  Set bd(){
        Set<Employee> Employees=new HashSet();

        List<Office> OfficeAtTheEmployeeC1= new ArrayList();

        Employee c1=new Employee("Иванов", "Директор", OfficeAtTheEmployeeC1);
        c1.setOfficeAtTheEmployee(new Office("Бумага",22.3,"Германия"));
        c1.setOfficeAtTheEmployee(new Office("Ручка",55.3,"Чехия"));
        c1.setOfficeAtTheEmployee(new Office("Файлы",33.1,"Чехия"));
        List<Office> OfficeAtTheEmployeeС2=new ArrayList();

        Employee c2=new Employee("Темофеев", "Бух", OfficeAtTheEmployeeС2 );
        c2.setOfficeAtTheEmployee(new Office("Бумага",20.3,"Германия"));
        c2.setOfficeAtTheEmployee(new Office("Ручка",50.3,"Турция"));
        c2.setOfficeAtTheEmployee(new Office("Файлы",80.1,"Чехия"));
        List<Office> OfficeAtTheEmployeeС3=new ArrayList();

        Employee c3=new Employee("Рожков", "секретарь", OfficeAtTheEmployeeС3 );
        c3.setOfficeAtTheEmployee(new Office("Бумага",25.3,"Россия"));
        c3.setOfficeAtTheEmployee(new Office("Ручка",10.3,"Турция"));
        c3.setOfficeAtTheEmployee(new Office("Файлы",20.1,"Чехия"));
        Employees.add(c1);
        Employees.add(c2);
        Employees.add(c3);



        return Employees;

    }
}

