package test.homework_2_test.task_3_test;
import main.java.homework_2.task3.*;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ClassMainTest {

    @Test
    public void main() {
        EmployeeBD EmployeeBD=new EmployeeBD();

        Set Employees =  EmployeeBD.bd();

        List OfficeAtTheEmployeeC1= new ArrayList();
        List SetOfTheBeginner=new ArrayList();

        NewEmployee c1=new NewEmployee("Шапкин", "Директор", OfficeAtTheEmployeeC1,SetOfTheBeginner);
        c1.setOfficeAtTheEmployee(new Pen("Ручка",22.3,"Германия","Шариковая"));
        c1.setOfficeAtTheEmployee(new Notebooks("Блакнот",50.5,"Греция","Твердый"));
        c1.setOfficeAtTheEmployee(new Paper("Папка",22.3,"Германия",500));

        Iterator<Office> iter = SetOfTheBeginner.iterator();

        Office elementNewEmployee = iter.next();
        assertThat("Office{name='Ручка', cost=22.3, Producer='Германия'}", is(elementNewEmployee.toString()));


    }
}
