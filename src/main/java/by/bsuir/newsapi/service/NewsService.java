package by.bsuir.newsapi.service;

import by.bsuir.newsapi.dao.impl.NewsRepository;
import by.bsuir.newsapi.model.request.NewsRequestTo;
import by.bsuir.newsapi.model.response.NewsResponseTo;
import by.bsuir.newsapi.service.exceptions.ResourceStateException;
import by.bsuir.newsapi.service.mapper.NewsMapper;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Data
@RequiredArgsConstructor
public class NewsService implements RestService<NewsRequestTo, NewsResponseTo> {
    private final NewsRepository newsRepository;

    private final NewsMapper newsMapper;

    @Override
    public List<NewsResponseTo> findAll() {
        return newsMapper.getListResponseTo(newsRepository.getAll());
    }

    @Override
    public NewsResponseTo findById(Long id) {
        return null;
    }

    @Override
    public NewsResponseTo create(NewsRequestTo newsTo) {
        return newsRepository
                .save(newsMapper.getNews(newsTo))
                .map(newsMapper::getResponseTo)
                .orElseThrow(NewsService::newsStateException);
    }

    @Override
    public NewsResponseTo update(NewsRequestTo editorTo) {
        return null;
    }

    @Override
    public boolean removeById(Long id) {
        return false;
    }

    private static ResourceStateException newsStateException() {
        return new ResourceStateException("Failed to create/update news with specified credentials", HttpStatus.CONFLICT.value() * 100 + 24);
    }
}
