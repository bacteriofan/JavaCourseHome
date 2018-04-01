
package main.java.homework_2.task4;
import java.util.List;

public class NewEmployee extends Employee {
    public List getSetOfTheBeginner() {
        return SetOfTheBeginner;
    }

    private List SetOfTheBeginner; //Набор новичка

    public NewEmployee(String nameV, String PositionV, List OfficeAtTheEmployeeV, List SetOfTheBeginnerV) {
        super(nameV, PositionV, OfficeAtTheEmployeeV);
        SetOfTheBeginner =SetOfTheBeginnerV;
        SetOfTheBeginner.add(new Pen("Ручка",22.3,"Германия","Шариковая"));
        SetOfTheBeginner.add(new Notebooks("Блакнот",50.5,"Греция","Твердый"));
        SetOfTheBeginner.add(new Paper("Альбом",100.5,"Франция",10));
        SetOfTheBeginner.add(new Paper("Альбом",10.5,"Франция",20));

    }
}