package by.bsuir.newsapi.dao.impl;

import by.bsuir.newsapi.dao.common.MemoryRepository;
import by.bsuir.newsapi.model.entity.Comment;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class CommentRepository extends MemoryRepository<Comment> {
    @Override
    public Optional<Comment> update(Comment entity) {
        return Optional.empty();
    }
}
