package by.bsuir.newsapi.model.request;

public record EditorRequestTo(
        Long id,
        String login,
        String password,
        String firstname,
        String lastname) {
}
