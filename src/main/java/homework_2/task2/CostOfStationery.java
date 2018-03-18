

package main.java.homework_2.task2;

public class CostOfStationery {

    public double sum(Employee[] Employee, String sotrudnik){
        double sum=0;
        for (int i = 0; i < Employee.length; i++) {
            String sotrudnikClassa=Employee[i].getName();
            if (sotrudnikClassa.equals(sotrudnik)) {
                Office[] KC=Employee[i].getOfficeAtTheEmployee();

                for (int j = 0; j < KC.length; j++) {

                    sum+=KC[j].getCost();
                }


            }


        }


        return sum;
    }
}
