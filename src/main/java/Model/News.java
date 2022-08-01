package Model;

import java.time.LocalDate;

public class News {
    private int id;
    private int cat_id;
    private String name;
    private String title;
    private String content;
    private String author;
    private LocalDate date;
    private String image_url;
    private boolean status;

    public News(int id, int cat_id, String name, String title, String content, String author, LocalDate date, String image_url, boolean status) {
        this.id = id;
        this.cat_id = cat_id;
        this.name = name;
        this.title = title;
        this.content = content;
        this.author = author;
        this.date = date;
        this.image_url = image_url;
        this.status = status;
    }

    public News(int cat_id, String name, String title, String content, String author, LocalDate date, String image_url, boolean status) {
        this.cat_id = cat_id;
        this.name = name;
        this.title = title;
        this.content = content;
        this.author = author;
        this.date = date;
        this.image_url = image_url;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCat_id() {
        return cat_id;
    }

    public void setCat_id(int cat_id) {
        this.cat_id = cat_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getImage_url() {
        return image_url;
    }

    public void setImage_url(String image_url) {
        this.image_url = image_url;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
