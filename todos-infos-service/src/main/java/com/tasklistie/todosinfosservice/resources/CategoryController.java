package com.tasklistie.todosinfosservice.resources;

import com.tasklistie.todosinfosservice.enums.CategoryEnum;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/category")
public class CategoryController {

    Logger log = LoggerFactory.getLogger(CategoryController.class);

    @PostMapping("/{category}/task/{taskId}")
    public void addToCategory(@PathVariable CategoryEnum category,
                              @PathVariable Integer taskId) {

        log.info("category={} task={}", category, taskId);
    }
}
