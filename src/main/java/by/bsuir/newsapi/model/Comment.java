package by.bsuir.newsapi.model;

import java.util.Objects;

public class Comment {
    private long id;
    
    private News news;
    
    private String content;

    public Comment() {
    }

    public Comment(long id, News news, String content) {
        this.id = id;
        this.news = news;
        this.content = content;
    }

    public Comment(News news, String content) {
        this.news = news;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public News getNews() {
        return news;
    }

    public void setNews(News news) {
        this.news = news;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Comment comment = (Comment) o;
        return id == comment.id && news.equals(comment.news) && content.equals(comment.content);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, news, content);
    }
}
