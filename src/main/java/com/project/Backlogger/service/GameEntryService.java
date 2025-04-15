package com.project.Backlogger.service;

import com.project.Backlogger.exception.GameEntryNotFoundException;
import com.project.Backlogger.model.GameEntry;
import com.project.Backlogger.repo.IGameEntryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameEntryService
{
    private final IGameEntryRepo gameEntryRepo;

    @Autowired
    public GameEntryService(IGameEntryRepo gameEntryRepo)
    {
        this.gameEntryRepo = gameEntryRepo;
    }

    public GameEntry addGameEntry(GameEntry gameEntry)
    {
        return gameEntryRepo.save(gameEntry);
    }

    public List<GameEntry> findAllGameEntries()
    {
        return gameEntryRepo.findAll();
    }

    public GameEntry updateGameEntry(GameEntry gameEntry)
    {
        return gameEntryRepo.save(gameEntry);
    }

    public GameEntry findGameEntryById(Long id)
    {
        return gameEntryRepo.findGameEntryById(id).orElseThrow(() -> new GameEntryNotFoundException("Entry by id"+ id + "was not found"));
    }

    public void deleteGameEntry(Long id)
    {
        gameEntryRepo.deleteGameEntryById(id);
    }
}
