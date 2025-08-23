package com.devsuperior.dslist.services;

import java.util.List;
import com.devsuperior.dslist.repository.GameRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.dslist.dto.GameMiniDTO;
import com.devsuperior.dslist.entities.Game;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    public List<GameMiniDTO> findAll() {
        List<Game> result = gameRepository.findAll();
        List<GameMiniDTO> dto = result.stream().map(x -> new GameMiniDTO(x)).toList();
        return dto;
    }
}
