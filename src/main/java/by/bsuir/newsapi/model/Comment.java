package by.bsuir.newsapi.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@NoArgsConstructor
public class Comment {
    private long id;
    
    private News news;
    
    private String content;

    public Comment(@NonNull News news, @NonNull String content) {
        this.news = news;
        this.content = content;
    }
}
