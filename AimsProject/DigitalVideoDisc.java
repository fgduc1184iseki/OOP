package AimsProject;

public class DigitalVideoDisc {
    private String title;
    private String category;
    private float cost;
    private String director;
    private int legth;
    private static int id = 0;

    public DigitalVideoDisc() {
    };

    public DigitalVideoDisc(String category, String title, float cost) {
        this.title = title;
        this.category = category;
        this.cost = cost;
        this.id++;
    }

    public DigitalVideoDisc(String director, String category, String title, float cost) {
        this.director = director;
        this.cost = cost;
        this.category = category;
        this.title = title;
        id++;
    }

    public DigitalVideoDisc(String director, String category, String title, int legth, float cost) {
        this.director = director;
        this.cost = cost;
        this.category = category;
        this.title = title;
        this.legth = legth;
        id++;
    }

    public DigitalVideoDisc(String title) {
        this.title = title;
        id++;
    }

    public String gettitle() {
        return title;
    }

    public int getid() {
        return id;
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
