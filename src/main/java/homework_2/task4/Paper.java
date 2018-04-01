
package main.java.homework_2.task4;

public class Paper extends Office {
    private int numberОfSheets; //Количество листов

    public Paper(String nameV, Double costV, String ProducerV, int numberОfSheets) {
        super(nameV, costV, ProducerV);
        numberОfSheets = numberОfSheets;
    }

    public int getNumberОfSheets() {
        return numberОfSheets;
    }

    public void setNumberОfSheets(int numberОfSheets) {
        this.numberОfSheets = numberОfSheets;
    }
}


