
package main.java.homework_2.task4;

public class Notebooks extends Office {
    private String cover; //Переплет

    public Notebooks(String nameV, Double costV, String ProducerV, String cover) {
        super(nameV, costV, ProducerV);
        cover = cover;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }
}
