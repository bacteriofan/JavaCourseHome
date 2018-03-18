

package main.java.homework_2.task2;

public class Office {
    private String  name; //Наименование
    private Double cost; //Стоимость
    private String Producer; //Производитель

    public Office(String  nameV,Double costV, String ProducerV){
        name=nameV;
        cost=costV;
        Producer=ProducerV;

    }


    public Double getCost() {
        return cost;
    }
}
