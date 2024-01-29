package by.bsuir.newsapi.model;

import java.time.LocalDateTime;
import java.util.Objects;


public class News {
    private long id;
    
    private Editor editor;
    
    private String title;
    
    private String context;
    
    private LocalDateTime created;
    
    private LocalDateTime modified;

    public News() {
    }

    public News(long id, Editor editor, String title, String context, LocalDateTime created, LocalDateTime modified) {
        this.id = id;
        this.editor = editor;
        this.title = title;
        this.context = context;
        this.created = created;
        this.modified = modified;
    }

    public News(Editor editor, String title, String context, LocalDateTime created, LocalDateTime modified) {
        this.editor = editor;
        this.title = title;
        this.context = context;
        this.created = created;
        this.modified = modified;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Editor getEditor() {
        return editor;
    }

    public void setEditor(Editor editor) {
        this.editor = editor;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public LocalDateTime getCreated() {
        return created;
    }

    public void setCreated(LocalDateTime created) {
        this.created = created;
    }

    public LocalDateTime getModified() {
        return modified;
    }

    public void setModified(LocalDateTime modified) {
        this.modified = modified;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        News news = (News) o;
        return id == news.id && editor.equals(news.editor) && title.equals(news.title) && context.equals(news.context) && created.equals(news.created) && modified.equals(news.modified);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, editor, title, context, created, modified);
    }
}
