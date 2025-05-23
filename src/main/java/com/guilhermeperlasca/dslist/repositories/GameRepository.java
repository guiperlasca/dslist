package com.guilhermeperlasca.dslist.repositories;

import com.guilhermeperlasca.dslist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {
}
