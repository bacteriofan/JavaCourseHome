
package main.java.homework_2.task3;

import java.util.List;

public class Employee {

    public Employee(String name) {
        this.name = name;
    }

    private String name; //Наименование
    private  String Position; //Должность

    private List OfficeAtTheEmployee; //Канцелярия у Сотрудника
    public Employee(String nameV, String PositionV, List OfficeAtTheEmployeeV){
        name=nameV;
        Position=PositionV;
        OfficeAtTheEmployee=OfficeAtTheEmployeeV;

    }

    public String getName() {
        return name;
    }

    public List getOfficeAtTheEmployee() {
        return OfficeAtTheEmployee;
    }

    public void setOfficeAtTheEmployee( Office officeAtTheEmployeeV) {
        OfficeAtTheEmployee.add( officeAtTheEmployeeV);
    }

}