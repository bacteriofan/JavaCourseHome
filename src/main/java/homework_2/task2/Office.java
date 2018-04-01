

package main.java.homework_2.task2;


public class Office {
    private String  name; //Наименование

    public String getName() {
        return name;
    }

    public String getProducer() {
        return producer;
    }

    private Double cost; //Стоимость
    private String producer; //Производитель

    public Office(String  nameV,Double costV, String ProducerV){
        name=nameV;
        cost=costV;
        producer=ProducerV;

    }
    //public Office(){}


    public Double getCost() {
        return cost;
    }
}
