

package main.java.homework_2.task3;
import java.util.List;

public class NewEmployee extends Employee {
    private List SetOfTheBeginner; //Набор новичка

    public NewEmployee(String nameV, String PositionV, List OfficeAtTheEmployeeV, List SetOfTheBeginnerV) {
        super(nameV, PositionV, OfficeAtTheEmployeeV);
        SetOfTheBeginner =SetOfTheBeginnerV;
        SetOfTheBeginner.add(new Pen("Ручка",22.3,"Германия","Шариковая"));
        SetOfTheBeginner.add(new Notebooks("Блакнот",50.5,"Греция","Твердый"));

    }
}