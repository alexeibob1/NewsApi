package by.bsuir.newsapi.controller;

import by.bsuir.newsapi.model.request.EditorRequestTo;
import by.bsuir.newsapi.model.response.EditorResponseTo;
import by.bsuir.newsapi.service.EditorService;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1.0/editors")
@Data
@AllArgsConstructor
public class EditorController {
    private EditorService editorService;
    
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<EditorResponseTo> findAll() {
        return editorService.findAll();
    }
    
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public EditorResponseTo create(@RequestBody EditorRequestTo dto) {
        return editorService.create(dto);
    }
}
