package by.bsuir.newsapi.controller;

import by.bsuir.newsapi.model.response.EditorResponseTo;
import by.bsuir.newsapi.service.EditorService;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1.0/editors")
@Data
@AllArgsConstructor
public class EditorController {
    private final EditorService editorService;
    
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<EditorResponseTo> findAll() {
        return editorService.findAll();
    }
}
