package by.bsuir.newsapi.service.exceptions;

import by.bsuir.newsapi.model.response.ErrorTo;
import jakarta.annotation.Nullable;
import lombok.Getter;

@Getter
public class ResourceException extends RuntimeException {
    @Nullable
    private final ErrorTo error;

    public ResourceException(String message, int code) {
        super(message);
        error = new ErrorTo(code, message);
    }
}
