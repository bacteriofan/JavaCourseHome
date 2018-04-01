

package main.java.homework_2.task3;

public class Paper extends Office {
    private int numberОfSheets; //Количество листов

    public int getNumberОfSheets() {
        return numberОfSheets;
    }

    public void setNumberОfSheets(int numberОfSheets) {
        numberОfSheets = numberОfSheets;
    }

    public Paper(String nameV, Double costV, String ProducerV, int numberОfSheets) {
        super(nameV, costV, ProducerV);
        numberОfSheets = numberОfSheets;
    }
}
