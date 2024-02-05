package by.bsuir.newsapi.service.mapper;

import by.bsuir.newsapi.model.entity.Editor;
import by.bsuir.newsapi.model.request.EditorRequestTo;
import by.bsuir.newsapi.model.response.EditorResponseTo;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface EditorMapper {
    EditorRequestTo getRequestTo(Editor editor);
    
    List<EditorRequestTo> getListRequestTo(Iterable<Editor> editors);

    EditorResponseTo getResponseTo(Editor editor);

    List<EditorResponseTo> getListResponseTo(Iterable<Editor> editors);
    
    //finish methods for backward transform from DTO to Editor
}