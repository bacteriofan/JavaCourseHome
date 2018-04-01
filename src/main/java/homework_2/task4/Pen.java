
package main.java.homework_2.task4;

public class Pen extends Office {
    private String coreType; //Тип стержня

    public Pen(String nameV, Double costV, String ProducerV, String coreType) {
        super(nameV, costV, ProducerV);
        coreType = coreType;
    }



    public String getCoreType() {
        return coreType;
    }

    public void setCoreType(String coreType) {
        this.coreType = coreType;
    }
}