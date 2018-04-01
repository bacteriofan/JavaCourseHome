
package main.java.homework_2.task4;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Employee {

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
        OfficeAtTheEmployee.add( officeAtTheEmployeeV);
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setOfficeAtTheEmployee(List officeAtTheEmployee) {
        OfficeAtTheEmployee = officeAtTheEmployee;
    }
}
