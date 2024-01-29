package by.bsuir.newsapi.model;


import java.util.Objects;

public class Tag {
    private long id;
    
    private String text;

    public Tag() {
    }

    public Tag(long id, String text) {
        this.id = id;
        this.text = text;
    }

    public Tag(String text) {
        this.text = text;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tag tag = (Tag) o;
        return id == tag.id && text.equals(tag.text);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, text);
    }
}
