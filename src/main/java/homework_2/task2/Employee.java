

package main.java.homework_2.task2;
import java.util.List;


public class Employee {

    private String name; //Наименование
    private  String       position; //Должность
    private List officeAtTheEmployee; //Канцелярия у Сотрудника


    public Employee(String nameV,  String PositionV, List OfficeAtTheEmployeeV){
        name=nameV;
        position=PositionV;
        officeAtTheEmployee= OfficeAtTheEmployeeV;

    }

    public String getName() {
        return name;
    }

    public List getOfficeAtTheEmployee() {
        return officeAtTheEmployee;
    }

    public void setOfficeAtTheEmployee(Office officeAtTheEmployeeV) {

        officeAtTheEmployee.add(officeAtTheEmployeeV);
    }


    public String getPosition() {
        return position;
    }
}
