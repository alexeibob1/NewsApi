package by.bsuir.newsapi.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@NoArgsConstructor
public class Editor {
    private long id;

    private String login;

    private String password;

    private String firstName;

    private String lastName;

    public Editor(@NonNull String login,
                  @NonNull String password,
                  @NonNull String firstName,
                  @NonNull String lastName) 
    {
        this.login = login;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
