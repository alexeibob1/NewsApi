package by.bsuir.newsapi.model.entity;

import by.bsuir.newsapi.model.AbstractEntity;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class Editor extends AbstractEntity {
    private String login;

    private String password;

    private String firstName;

    private String lastName;
}
