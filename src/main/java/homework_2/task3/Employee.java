
package main.java.homework_2.task3;

import java.util.List;

public class Employee {

    public Employee(String name) {
        this.name = name;
    }

    private String name; //Наименование
    private  String       position; //Должность

    private List OfficeAtTheEmployee; //Канцелярия у Сотрудника
    public Employee(String nameV, String PositionV, List OfficeAtTheEmployeeV){
        name=nameV;
        position=PositionV;
        OfficeAtTheEmployee=OfficeAtTheEmployeeV;

    }

    public String getName() {
        return name;
    }

    public List getOfficeAtTheEmployee() {
        return OfficeAtTheEmployee;
    }

    public void setOfficeAtTheEmployee( Office officeAtTheEmployeeV) {
        OfficeAtTheEmployee.add(officeAtTheEmployeeV);
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        position = position;
    }

    public void setOfficeAtTheEmployee(List officeAtTheEmployee) {
        OfficeAtTheEmployee = officeAtTheEmployee;
    }
}
