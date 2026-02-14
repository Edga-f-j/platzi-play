package com.platzi.play.web.controller;


import com.platzi.play.persistence.entity.MovieEntity;
import com.platzi.play.persistence.entity.crud.CrudMovieEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class MovieController {
    private final CrudMovieEntity crudMovieEntity;

    public MovieController(CrudMovieEntity crudMovieEntity) {
        this.crudMovieEntity = crudMovieEntity;
    }

    @GetMapping("/movies")
    public List<MovieEntity> getall(){
        return (List<MovieEntity>) this.crudMovieEntity.findAll();
    }
}
