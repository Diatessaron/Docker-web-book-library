package ru.otus.dockerwebbooklibrary.page.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ru.otus.dockerwebbooklibrary.domain.Genre;
import ru.otus.dockerwebbooklibrary.service.GenreService;

import java.util.List;

@Controller
public class GenrePageController {
    private final GenreService genreService;

    public GenrePageController(GenreService genreService) {
        this.genreService = genreService;
    }

    @GetMapping("/genres/add")
    public String createPage() {
        return "genreSave";
    }

    @GetMapping("/genres/id")
    public String getGenreById(@RequestParam String id, Model model) {
        model.addAttribute("genre", genreService.getGenreById(id));
        return "genre";
    }

    @GetMapping("/genres")
    public String getAll(Model model) {
        final List<Genre> genres = genreService.getAll();
        model.addAttribute("genres", genres);
        return "genreList";
    }

    @GetMapping("/genres/edit")
    public String editPage(@RequestParam String id, Model model) {
        model.addAttribute("genre", genreService.getGenreById(id));
        return "genreEdit";
    }
}
