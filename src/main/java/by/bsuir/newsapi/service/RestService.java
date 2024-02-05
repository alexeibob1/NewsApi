package by.bsuir.newsapi.service;

import java.util.List;

public interface RestService<Q, A> {
    List<A> findAll();
    
    A findById(Long id);
    
    A create(Q userTo);
    
    A update(Q userTo);
    
    boolean removeById(Long id);
}
