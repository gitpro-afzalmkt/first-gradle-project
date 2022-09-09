package com.afzal.gradleproj.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.afzal.gradleproj.Entity.Player;

@Repository
public interface PlayerRepository extends JpaRepository<Player, Integer>{

}
