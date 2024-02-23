package by.bsuir.newsapi.model.request;

public record NewsRequestTo(
        EditorRequestTo editor,
        String title,
        String content
) { }
