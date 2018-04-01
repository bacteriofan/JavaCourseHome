package test.homework_2_test.task_5_test;
import main.java.homework_2.task5.LogStudent;
import main.java.homework_2.task5.LogStudentBD;
import main.java.homework_2.task5.SearchOfGroups;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class MainClassTest {

    @Test
    public void main() {

        LogStudentBD Studentbd = new LogStudentBD();
        List<LogStudent> bd=Studentbd.bd();

        List<String> ctr=new ArrayList<String>();

        ctr.addAll(SearchOfGroups.Search(bd, "Ivanov"));


        Iterator<String> iter = ctr.iterator();

        String elementNewEmployee = iter.next();


        assertEquals("Группа=K-2018, Дисциплина=MATHEMATICS, Студент=Ivanov, Оценка=5", elementNewEmployee.toString());

    }
}