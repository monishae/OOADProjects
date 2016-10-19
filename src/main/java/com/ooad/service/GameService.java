package com.ooad.service;

import java.util.List;

import com.ooad.entity.Player;
import com.ooad.entity.Route;

public interface GameService {
	
	void startGame(List<Player> players);
	
	void playerTurn();
	
	Route BuildRoute();
	
	void GameEnds();
	

}
