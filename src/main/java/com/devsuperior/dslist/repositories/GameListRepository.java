package com.devsuperior.dslist.repositories;

import com.devsuperior.dslist.Game;
import com.devsuperior.dslist.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<GameList, Long> {
}
