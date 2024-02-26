package by.bsuir.newsapi.model.request;

import jakarta.validation.constraints.NotBlank;
import org.hibernate.validator.constraints.Length;

public record EditorRequestTo(
        Long id,
        
        @NotBlank
        @Length(min = 2, max = 64)
        String login,
        
        @NotBlank
        @Length(min =  8, max = 128)
        String password,

        @NotBlank
        @Length(min =  2, max = 64)
        String firstname,

        @NotBlank
        @Length(min =  2, max = 64)
        String lastname) {
}
