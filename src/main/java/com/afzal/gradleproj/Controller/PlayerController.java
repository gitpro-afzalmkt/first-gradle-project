package com.afzal.gradleproj.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.afzal.gradleproj.Entity.Player;
import com.afzal.gradleproj.Repository.PlayerRepository;

@RestController
public class PlayerController {
	
		@Autowired
		private PlayerRepository repo;
		
		
		@GetMapping("/allPlayers")
		public List<Player> allPlayers() {
			return repo.findAll();
		}
		
		
		@PostMapping("/addPlayer")
		public Player addPlayer(@RequestBody Player p) {
			return repo.save(p);
		}
		
		
		@GetMapping("/findPlayer/{id}")
		public Optional<Player> findPlayer(@PathVariable("id") int id) {
			return repo.findById(id);
		}

}
