package com.ooad.service;

import java.util.List;

import com.ooad.entity.Cards;
import com.ooad.entity.DestinationCard;
import com.ooad.entity.TrainCard;

public interface CardService {

	 List<TrainCard> initialTrainCards();

	List<DestinationCard> initialDestCards();

	

}
