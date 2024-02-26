package by.bsuir.newsapi.model.request;

import org.hibernate.validator.constraints.Length;

public record CommentRequestTo(
        Long id,
        Long newsId,
        @Length(min = 2, max = 2048)
        String content) 
{}
