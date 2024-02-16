package by.bsuir.newsapi.model.response;

import lombok.Builder;

public record ErrorTo (
    int errorCode,
    String errorMessage
) {}