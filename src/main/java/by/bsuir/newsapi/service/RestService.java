package by.bsuir.newsapi.service;

import java.util.List;

public interface RestService<Q, A> {
    List<A> findAll();
    
    A findById(Long id);
    
    A create(Q editorTo);
    
    A update(Q editorTo);
    
    boolean removeById(Long id);
}
