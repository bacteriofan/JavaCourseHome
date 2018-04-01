
package main.java.homework_2.task3;
import java.util.Objects;

public class Office {
    public void setName(String name) {
        this.name = name;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        producer = producer;
    }

    private String  name; //Наименование
    private Double cost; //Стоимость
    private String producer; //Производитель

    public Office(String  nameV, Double costV, String ProducerV){
        name=nameV;
        cost=costV;
        producer=ProducerV;

    }
    //public Office(){}


    public Double getCost() {
        return cost;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Office{" +
                "name='" + name + '\'' +
                ", cost=" + cost +
                ", Producer='" + producer + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Office office = (Office) o;
        return Objects.equals(name, office.name) &&
                Objects.equals(cost, office.cost) &&
                Objects.equals(producer, office.producer);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, cost, producer);
    }
}
