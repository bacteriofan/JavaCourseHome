package test.homework_2_test.task_2_test;
import main.java.homework_2.task2.CostOfStationery;
import main.java.homework_2.task2.EmployeeBD;
import org.junit.Test;

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