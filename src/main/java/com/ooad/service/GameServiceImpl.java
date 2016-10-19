package com.ooad.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.ooad.entity.Cards;
import com.ooad.entity.GameStats;
import com.ooad.entity.Player;
import com.ooad.entity.Route;
import com.ooad.repository.GameStatsRepository;
import com.ooad.repository.PlayerRepository;

public class GameServiceImpl implements GameService {
	
	@Autowired
	private GameStatsRepository gameRepo;
	
	@Autowired
	private PlayerRepository playerRepo;

	GameStats newGame = new GameStats();
	
	

	@Autowired
	public void startGame(List<Player> players) {

		CardService cardService = null;

		newGame.setPlayers(players);

		newGame.setNewGame(true);
		// Set Color to player !!!!

		// Set other 5 face up cards

		for (Player p : players) {

			p.setTrainCards(cardService.initialTrainCards());
			p.setDestCard(cardService.initialDestCards());
			playerRepo.save(p);

		}
		

	}

	public void playerTurn() {
		newGame.setNewGame(false);
		newGame.setPlaying(true);
		
		pickDestinationCard();
		
		int turn =2;
		
		while(turn>0){
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
		}
		
		if(checkEndGame()){
			newGame.setPlaying(false);
			newGame.setEnded(true);
			GameEnds();
			
		}
		
	
		/*pickDestCard();
		- Pick destination card{
			KeepCard
			ReturnCard
		}

	- Pick train card
		- Pick train card from deck{
				turn =2;
		while(turn){
			case1:pick	Card	from	Deck
			if(joker){
				turn 0;
			}
			else {
				turn- - 
			}
			case2: pick Card from face
			if(joker){
				turn 0;
			}
			else {
				turn- - 
			}
		}*/

		
		
		BuildRoute();
	
	}

	private boolean checkEndGame() {
		
		return false;
	}

	private void pickDestinationCard() {
		// TODO Auto-generated method stub

	}

	public void pickCardFromDeck() {

	}

	public void pickCardFromFaceUp() {

	}

	public void GameEnds() {
		

	}

	private void keepCard() {

	}

	private Cards ReturnCard() {
		return null;

	}

	public Route BuildRoute() {

		{
			/*- check for eligibility
			{
				-Check route-length train cars
				-check train cards of route color
				-check if route free
			}
			//should we make these also one call
			Post turn logic:
			{	
				- Subtract train cars from player(CheckForEndGame)
				- Subtract train cards from user
				-  updateRouteOwner
				- calculate points
			}*/
		}
		return null;
	}
}
