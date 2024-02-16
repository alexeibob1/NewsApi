package by.bsuir.newsapi.service.exceptions;

import by.bsuir.newsapi.model.response.ErrorTo;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class CommonExceptionAdvice {
    @ExceptionHandler({ResourceNotFoundException.class})
    public ResponseEntity<ErrorTo> catchNotFoundException(ResourceNotFoundException e) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getError());
    }

}
