package main.java.homework_2.task4;


import java.util.Objects;

public class Office {
    private String name; //Наименование
    private Double cost; //Стоимость
    private String producer; //Производитель

    public Office(String nameV, Double costV, String ProducerV) {
        name = nameV;
        cost = costV;
        producer = ProducerV;

    }
    //public Office(){}


    public Double getCost() {
        return cost;
    }
}