

package main.java.homework_2.task3;
public class Pen extends Office {
    private String coreType; //Тип стержня

    public void setCoreType(String coreType) {
        coreType = coreType;
    }

    public Pen(String nameV, Double costV, String ProducerV, String coreType) {
        super(nameV, costV, ProducerV);
        coreType = coreType;
    }

    public String getCoreType() {
        return coreType;
    }
}

