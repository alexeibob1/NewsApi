package by.bsuir.newsapi.model;

import lombok.Getter;
import lombok.Setter;

public abstract class AbstractEntity implements Entity {
    private Long id;
    
    @Override
    public Long getId() {
        return id;
    }
    
    @Override
    public void setId(Long id) {
        this.id = id;
    }
}
