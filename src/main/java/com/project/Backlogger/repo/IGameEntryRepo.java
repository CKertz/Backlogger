package com.project.Backlogger.repo;

import com.project.Backlogger.model.GameEntry;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface IGameEntryRepo extends JpaRepository<GameEntry, Long>
{

    void deleteGameEntryById(Long id);

    Optional<GameEntry> findGameEntryById(Long id);
}
