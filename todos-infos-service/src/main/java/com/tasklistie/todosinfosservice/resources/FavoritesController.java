package com.tasklistie.todosinfosservice.resources;

import com.tasklistie.todosinfosservice.models.FavoriteEntity;
import com.tasklistie.todosinfosservice.service.FavoritesService;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/favorites")
public class FavoritesController {

    private final FavoritesService favoritesService;

    public FavoritesController(FavoritesService favoritesService) {
        this.favoritesService = favoritesService;
    }

    @GetMapping("/user/{userId}/task")
    public List<FavoriteEntity> getAllUserFavorites(@PathVariable Integer userId) {
        return favoritesService.getAllUserFavorites(userId);
    }

    @PostMapping("/user/{userId}/task/{taskId}")
    public void addTaskToFavorites(@PathVariable Integer userId, @PathVariable Integer taskId) {
        favoritesService.addTaskToFavorites(userId, taskId);
    }

    @DeleteMapping("/user/{userId}/task/{taskId}")
    public void deleteTaskToFavorites(@PathVariable Integer userId, @PathVariable Integer taskId) {
        favoritesService.deleteTaskToFavorites(userId, taskId);
    }
}
