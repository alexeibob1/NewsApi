package by.bsuir.newsapi.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
public class News {
    private long id;
    
    private Editor editor;
    
    private String title;
    
    private String context;
    
    private LocalDateTime created;
    
    private LocalDateTime modified;

    public News(@NonNull Editor editor, 
                @NonNull String title,
                @NonNull String context, 
                @NonNull LocalDateTime created, 
                @NonNull LocalDateTime modified) 
    {
        this.editor = editor;
        this.title = title;
        this.context = context;
        this.created = created;
        this.modified = modified;
    }
}
