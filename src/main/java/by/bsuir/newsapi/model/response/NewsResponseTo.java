package by.bsuir.newsapi.model.response;

import java.sql.Timestamp;

public record NewsResponseTo(
        EditorResponseTo editor,
        String title,
        String content,
        Timestamp created,
        Timestamp modified
) {}
