
package main.java.homework_2.task3;
import java.util.Objects;

public class Office {
    private String  name; //Наименование
    private Double cost; //Стоимость
    private String Producer; //Производитель

    public Office(String  nameV, Double costV, String ProducerV){
        name=nameV;
        cost=costV;
        Producer=ProducerV;

    }



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
                ", Producer='" + Producer + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Office office = (Office) o;
        return Objects.equals(name, office.name) &&
                Objects.equals(cost, office.cost) &&
                Objects.equals(Producer, office.Producer);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, cost, Producer);
    }
}