package by.bsuir.newsapi.dao.common;

import by.bsuir.newsapi.model.AbstractEntity;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicLong;

@Repository
public abstract class AbstractMemoryRepository<T extends AbstractEntity> implements CrudRepository<Long, T> {
    private final static AtomicLong ids = new AtomicLong();
    
    protected final Map<Long, T> map = new HashMap<>();
    
    @Override
    public Optional<T> getBy(Long id) {
        return Optional.ofNullable(map.get(id));
    }

    @Override
    public Iterable<T> getAll() {
        return map.values();
    }

    @Override
    public Optional<T> save(T entity) {
        long id = ids.incrementAndGet();
        entity.setId(id);
        map.put(id, entity);
        return Optional.of(entity);
    }

    @Override
    public boolean delete(T entity) {
        return map.remove(entity.getId(), entity);
    }
}
