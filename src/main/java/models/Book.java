package models;

public class Book {


    private String title;
    private String publicationDate;
    private int id;

    public Book(String title, String publicationDate) {
        this.title = title;
        this.publicationDate = publicationDate;
    }

    public Book(){

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(String publicationDate) {
        this.publicationDate = publicationDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
