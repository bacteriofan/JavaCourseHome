

package main.java.homework_2.task4;

import java.util.*;

public class ClassMain {
    public  static void main(String[] args) {

        EmployeeBD EmployeeBD=new EmployeeBD();

        Set Employees =  EmployeeBD.bd();

        List OfficeAtTheEmployeeC1= new ArrayList();
        List SetOfTheBeginner=new ArrayList();

        NewEmployee c1=new NewEmployee("Шапкин", "Оператор", OfficeAtTheEmployeeC1,SetOfTheBeginner);
        c1.setOfficeAtTheEmployee(new Pen("Ручка",22.3,"Германия","Шариковая"));
        c1.setOfficeAtTheEmployee(new Notebooks("Блакнот",50.5,"Греция","Твердый"));
        c1.setOfficeAtTheEmployee(new Paper("Папка",22.3,"Германия",500));

        System.out.println("Набор новечка "+c1.getName());
        System.out.println("Коллекция без сортировки");

        for (Object stroka: SetOfTheBeginner) {
            System.out.println(stroka);}

        System.out.println("Сортировка по стоимости");
        List SetOfTheBeginnerSortingCost=new ArrayList();
        SetOfTheBeginnerSortingCost.addAll(SetOfTheBeginner);
        Collections.sort(SetOfTheBeginnerSortingCost, new CostComparator());
        for (Object stroka: SetOfTheBeginnerSortingCost) {
            //stroka.getClass();
            System.out.println(stroka);}

        System.out.println("Сортировка по имени");
        List SetOfTheBeginnerSortingName=new ArrayList();
        SetOfTheBeginnerSortingName.addAll(SetOfTheBeginner);
        Collections.sort(SetOfTheBeginnerSortingName, new NameComparator());
        for (Object stroka: SetOfTheBeginnerSortingName) {
            //stroka.getClass();
            System.out.println(stroka);}

        System.out.println("Сортировка по стоимости и по имени");
        List SetOfTheBeginnerSortingCostName=new ArrayList();
        SetOfTheBeginnerSortingCostName.addAll(SetOfTheBeginner);
        Collections.sort(SetOfTheBeginnerSortingCostName, new CostComparator());
        Collections.sort(SetOfTheBeginnerSortingCostName, new NameComparator());
        for (Object stroka: SetOfTheBeginnerSortingCostName) {
            //stroka.getClass();
            System.out.println(stroka);}



    }
}

