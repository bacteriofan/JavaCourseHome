

package main.java.homework_2.task3;
public class Pen extends Office {
    private String CoreType; //Тип стержня

    public Pen(String nameV, Double costV, String ProducerV, String coreType) {
        super(nameV, costV, ProducerV);
        CoreType = coreType;
    }

    public String getCoreType() {
        return CoreType;
    }
}
