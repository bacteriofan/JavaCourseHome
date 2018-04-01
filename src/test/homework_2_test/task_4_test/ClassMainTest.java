package test.homework_2_test.task_4_test;
import main.java.homework_2.task2.*;

import java.util.*;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
import org.junit.Test;

public class ClassMainTest {

    @Test
    public void main() {
        EmployeeBD EmployeeBD=new EmployeeBD();

        Set Employees =  EmployeeBD.bd();

        List OfficeAtTheEmployeeC1= new ArrayList();
        List SetOfTheBeginner=new ArrayList();

        NewEmployee c1=new NewEmployee("Шапкин", "Оператор", OfficeAtTheEmployeeC1,SetOfTheBeginner);
        c1.setOfficeAtTheEmployee(new Pen("Ручка",22.3,"Германия","Шариковая"));
        c1.setOfficeAtTheEmployee(new Notebooks("Блакнот",50.5,"Греция","Твердый"));
        c1.setOfficeAtTheEmployee(new Paper("Папка",22.3,"Германия",500));

        List SetOfTheBeginnerSortingCostName=new ArrayList();
        SetOfTheBeginnerSortingCostName.addAll(SetOfTheBeginner);
        Collections.sort(SetOfTheBeginnerSortingCostName, new CostComparator());
        Collections.sort(SetOfTheBeginnerSortingCostName, new NameComparator());

        Iterator<Office> iter = SetOfTheBeginnerSortingCostName.iterator();

        Office elementNewEmployee = iter.next();
        assertThat("Office{name='Альбом', cost=10.5, Producer='Франция'}", is(elementNewEmployee.toString()));

    }
}
