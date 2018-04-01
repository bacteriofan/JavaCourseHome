package test.homework_2_test.task_6_test;
import main.java.homework_2.task6.*;
import org.junit.Test;

import static org.junit.Assert.*;


public class ClassMainTest {

    @Test
    public void main() {

        AtomicBoat Boat=new AtomicBoat(0,0);
        Plit Theengine=Boat.creatTheengineFortheAtomicBoat();

        Theengine.Forward(100);

        assertEquals(100,Boat.getX());



    }
}
