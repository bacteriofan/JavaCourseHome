
package main.java.homework_2.task4;

public class Office {
    private String  name; //Наименование
    private Double cost; //Стоимость
    private String Producer; //Производитель

    public Office(String  nameV, Double costV, String ProducerV){
        name=nameV;
        cost=costV;
        Producer=ProducerV;

    }
    //public Office(){}


    public Double getCost() {
        return cost;
    }



    @Override
    public String toString() {
        return "Office{" +
                "name='" + name + '\'' +
                ", cost=" + cost +
                ", Producer='" + Producer + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }
}
