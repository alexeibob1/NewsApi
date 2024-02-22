package by.bsuir.newsapi.model.request;

public record EditorRequestTo(
        String login,
        String password,
        String firstname,
        String lastname) {
}
