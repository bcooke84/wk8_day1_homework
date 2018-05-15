package models;

import javax.persistence.*;

@Entity
@Table(name="books")
public class Book {


    private String title;
    private String publicationDate;
    private int id;
    private Author author;

    public Book(String title, String publicationDate, Author author) {
        this.title = title;
        this.publicationDate = publicationDate;
        this.author = author;
    }

    public Book(){

    }
    @Column(name = "title")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Column(name = "publication_date")
    public String getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(String publicationDate) {
        this.publicationDate = publicationDate;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @ManyToOne
    @JoinColumn(name = "author_id", nullable = false)
    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }
}
