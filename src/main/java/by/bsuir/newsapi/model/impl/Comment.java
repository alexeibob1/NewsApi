package by.bsuir.newsapi.model.impl;

import by.bsuir.newsapi.model.AbstractEntity;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class Comment extends AbstractEntity {
    private News news;
    
    private String content;
}
