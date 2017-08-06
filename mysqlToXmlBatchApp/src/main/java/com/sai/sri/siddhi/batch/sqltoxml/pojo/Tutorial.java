package com.sai.sri.siddhi.batch.sqltoxml.pojo;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="tutorial")
public class Tutorial {
    private int tutorial_id;
    private String author;
    private String title;
    private String date;
    private String icon;
    private String description;

    @XmlAttribute(name="id")
    public int getTutorial_id() {
        return tutorial_id;
    }

    public void setTutorial_id(int tutorial_id) {
        this.tutorial_id = tutorial_id;
    }

    @XmlElement(name="Author")
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @XmlElement(name="Title")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @XmlElement(name="Date")
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @XmlElement(name="Icon")
    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    @XmlElement(name="Description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

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
}
