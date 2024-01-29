package by.bsuir.newsapi.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@NoArgsConstructor
public class Tag {
    private long id;
    
    private String text;

    public Tag(@NonNull String text) {
        this.text = text;
    }
}
