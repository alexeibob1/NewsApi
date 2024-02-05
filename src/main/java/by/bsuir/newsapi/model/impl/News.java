package by.bsuir.newsapi.model.impl;

import by.bsuir.newsapi.model.AbstractEntity;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@Builder
public class News extends AbstractEntity {
    private Editor editor;
    
    private String title;
    
    private String context;
    
    private LocalDateTime created;
    
    private LocalDateTime modified;
}
