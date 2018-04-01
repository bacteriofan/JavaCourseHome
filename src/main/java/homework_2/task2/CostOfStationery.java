

package main.java.homework_2.task2;

import java.util.Iterator;
import java.util.Set;



public class CostOfStationery {

    public double sum(Set Employee, String sotrudnir){
        double sum=0;
        for (Iterator<Employee> iter = Employee.iterator(); iter.hasNext(); ) {
            Employee elementEmployee = iter.next();
            elementEmployee.getOfficeAtTheEmployee();
            for (Iterator<Office> iter1 = elementEmployee.getOfficeAtTheEmployee().iterator(); iter1.hasNext(); ) {
                Office elementofficeAtTheEmployee = iter1.next();
                if (elementEmployee.getName().equals(sotrudnir)) {
                    sum+=elementofficeAtTheEmployee.getCost();

                }
            }


        }


        return sum;
    }
}