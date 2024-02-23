package by.bsuir.newsapi.model.entity;

import by.bsuir.newsapi.model.AbstractEntity;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.sql.Time;
import java.sql.Timestamp;
import java.time.LocalDateTime;

@Getter
@Setter
@SuperBuilder
public class News extends AbstractEntity {
    private Editor editor;
    
    private String title;
    
    private String context;
    
    private Timestamp created;
    
    private Timestamp modified;
}
