package by.bsuir.newsapi.service;

import by.bsuir.newsapi.dao.impl.EditorRepository;
import by.bsuir.newsapi.model.request.EditorRequestTo;
import by.bsuir.newsapi.model.response.EditorResponseTo;
import by.bsuir.newsapi.service.mapper.EditorMapper;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Data
@AllArgsConstructor
public class EditorService implements RestService<EditorRequestTo, EditorResponseTo> {
    @Autowired
    private EditorRepository editorRepository;

    @Autowired
    private EditorMapper editorMapper;

    @Override
    public List<EditorResponseTo> findAll() {
        return editorMapper.getListResponseTo(editorRepository.getAll());
    }

    @Override
    public EditorResponseTo findById(Long id) {
        return null;
    }

    @Override
    public EditorResponseTo create(EditorRequestTo editorTo) {
        return editorRepository
                .save(editorMapper.getEditor(editorTo))
                .map(editorMapper::getResponseTo)
                .orElseThrow();
    }

    @Override
    public EditorResponseTo update(EditorRequestTo userTo) {
        return null;
    }

    @Override
    public boolean removeById(Long id) {
        return false;
    }
}
