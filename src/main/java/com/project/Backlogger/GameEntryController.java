package com.project.Backlogger;

import com.project.Backlogger.model.GameEntry;
import com.project.Backlogger.service.GameEntryService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/gameEntry")
public class GameEntryController
{
    private final GameEntryService gameEntryService;

    public GameEntryController(GameEntryService gameEntryService)
    {
        this.gameEntryService = gameEntryService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<GameEntry>> getAllGameEntries()
    {
        List<GameEntry> gameEntries = gameEntryService.findAllGameEntries();
        return new ResponseEntity<>(gameEntries, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<GameEntry> getGameEntryById(@PathVariable("id") Long id)
    {
        GameEntry gameEntry = gameEntryService.findGameEntryById(id);
        return new ResponseEntity<>(gameEntry, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<GameEntry> addGameEntry(@RequestBody GameEntry gameEntryToAdd)
    {
        GameEntry gameEntry = gameEntryService.addGameEntry(gameEntryToAdd);
        return new ResponseEntity<>(gameEntry, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<GameEntry> updateGameEntry(@RequestBody GameEntry gameEntryToAdd)
    {
        GameEntry gameEntry = gameEntryService.updateGameEntry(gameEntryToAdd);
        return new ResponseEntity<>(gameEntry, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteGameEntry(@PathVariable("id") Long id)
    {
        gameEntryService.deleteGameEntry(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}

