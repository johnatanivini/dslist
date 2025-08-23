package com.devsuperior.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dslist.dto.GameListDTO;
import com.devsuperior.dslist.services.GameListService;

@RestController
@RequestMapping(value = "/lists")
public class ListsController {
    @Autowired
    private GameListService service;

    @GetMapping(value = "/{id}")
    public GameListDTO findById(@PathVariable Long id) {
        return service.findById(id);
    }

    @GetMapping
    public List<GameListDTO> findAll() {
        return service.findAll();
    }
}
