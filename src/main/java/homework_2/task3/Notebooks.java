

package main.java.homework_2.task3;

public class Notebooks extends Office {
    public void setCover(String cover) {
        cover = cover;
    }

    private String cover; //Переплет

    public Notebooks(String nameV, Double costV, String ProducerV, String cover) {
        super(nameV, costV, ProducerV);
        cover = cover;
    }

    public String getCover() {
        return cover;
    }
}
