
package main.java.homework_2.task4;

public class Paper extends Office {
    private int NumberОfSheets; //Количество листов

    public Paper(String nameV, Double costV, String ProducerV, int numberОfSheets) {
        super(nameV, costV, ProducerV);
        NumberОfSheets = numberОfSheets;
    }
}

