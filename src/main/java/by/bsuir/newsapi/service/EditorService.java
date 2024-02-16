package by.bsuir.newsapi.service;

import by.bsuir.newsapi.dao.impl.EditorRepository;
import by.bsuir.newsapi.model.request.EditorRequestTo;
import by.bsuir.newsapi.model.response.EditorResponseTo;
import by.bsuir.newsapi.service.exceptions.ResourceNotFoundException;
import by.bsuir.newsapi.service.mapper.EditorMapper;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
@Data
@RequiredArgsConstructor
public class EditorService implements RestService<EditorRequestTo, EditorResponseTo> {
    private final EditorRepository editorRepository;

    private final EditorMapper editorMapper;

    @Override
    public List<EditorResponseTo> findAll() {
        return editorMapper.getListResponseTo(editorRepository.getAll());
    }

    @Override
    public EditorResponseTo findById(Long id) {
        return editorMapper.getResponseTo(editorRepository
                .getBy(id)
                .orElseThrow(() -> editorNotFoundException(id)));
    }

    @Override
    public EditorResponseTo create(EditorRequestTo editorTo) {
        return editorRepository
                .save(editorMapper.getEditor(editorTo))
                .map(editorMapper::getResponseTo)
                .orElseThrow();
    }

    @Override
    public EditorResponseTo update(EditorRequestTo editorTo) {
        return editorRepository
                .update(editorMapper.getEditor(editorTo))
                .map(editorMapper::getResponseTo)
                .orElseThrow(() -> editorNotFoundException(editorTo.id()));
    }

    @Override
    public boolean removeById(Long id) {
        if (!editorRepository.removeById(id)) {
            throw editorNotFoundException(id);
        }
        return true;
    }

    private static ResourceNotFoundException editorNotFoundException(Long id) {
        return new ResourceNotFoundException("Failed to find editor with id = " + id, HttpStatus.NOT_FOUND.value() * 100 + 23);
    }
}
