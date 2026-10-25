package AimsProject;

public class DigitalVideoDisc {
    private String title;
    private String category;
    private float cost;
    private String director;
    private int legth;

    public DigitalVideoDisc() {
    };

    public DigitalVideoDisc(String category, String title, float cost) {
        this.title = title;
        this.category = category;
        this.cost = cost;
    }

    public DigitalVideoDisc(String director, String category, String title, float cost) {
        this.director = director;
        this.cost = cost;
        this.category = category;
        this.title = title;
    }

    public DigitalVideoDisc(String director, String category, String title, int legth, float cost) {
        this.director = director;
        this.cost = cost;
        this.category = category;
        this.title = title;
        this.legth = legth;
    }

    public DigitalVideoDisc(String title) {
        this.title = title;
    }

    public String gettitle() {
        return title;
    }

    public String getcategory() {
        return category;
    }

    public float getcost() {
        return cost;
    }

    public String getdirecctor() {
        return director;
    }

    public int getlegth() {
        return legth;
    }

}
