

package main.java.homework_2.task3;

public class Notebooks extends Office {
    private String Cover; //Переплет

    public Notebooks(String nameV, Double costV, String ProducerV, String cover) {
        super(nameV, costV, ProducerV);
        Cover = cover;
    }

    public String getCover() {
        return Cover;
    }
}