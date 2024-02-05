package by.bsuir.newsapi.dao.impl;

import by.bsuir.newsapi.dao.common.MemoryRepository;
import by.bsuir.newsapi.model.entity.Editor;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class EditorRepository extends MemoryRepository<Editor> {
    @Override
    public Optional<Editor> update(Editor entity) {
        return Optional.empty();
    }
}
