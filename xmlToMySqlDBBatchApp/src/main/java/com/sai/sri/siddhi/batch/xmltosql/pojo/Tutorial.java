package com.sai.sri.siddhi.batch.xmltosql.pojo;

public class Tutorial {

    private int tutorial_id;
    private String author;
    private String title;
    private String date;
    private String icon;
    private String description;

    @Override
    public String toString() {
        return "Tutorial{" +
                "tutorial_id=" + tutorial_id +
                ", author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", date='" + date + '\'' +
                ", icon='" + icon + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    public int getTutorial_id() {
        return tutorial_id;
    }

    public void setTutorial_id(int tutorial_id) {
        this.tutorial_id = tutorial_id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
