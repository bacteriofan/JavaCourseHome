package test;
import org.junit.Test;

import main.java.homework_2.task2.CostOfStationery;
import main.java.homework_2.task2.EmployeeBD;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


public class ClassMainTest {

    @Test
    public void main() {
        EmployeeBD EmployeeBD=new EmployeeBD();
        CostOfStationery CostOfStationery=new CostOfStationery();

        assertThat(55.7, is(CostOfStationery.sum(EmployeeBD.bd(),"Рожков")));
    }
}