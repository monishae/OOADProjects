package com.ooad.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;

@JsonPOJOBuilder
public class Player {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@JsonProperty("playerId")
	private Integer playerId;

	@JsonProperty("playerName")
	private String playerName;

	@JsonProperty("createdDate")
	private Date createdDate;

	@JsonProperty("hsGameID")
	private GameStats hsGameID;

	@JsonProperty("playerColor")
	private Color playerColor;

	private boolean isPlaying;

	private List<TrainCard> trainCards;

	private List<DestinationCard> destCard;

	/**
	 * @return the playerId
	 */
	public Integer getPlayerId() {
		return playerId;
	}

	/**
	 * @param playerId
	 *            the playerId to set
	 */
	public void setPlayerId(Integer playerId) {
		this.playerId = playerId;
	}

	/**
	 * @return the playerName
	 */
	public String getPlayerName() {
		return playerName;
	}

	/**
	 * @param playerName
	 *            the playerName to set
	 */
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	/**
	 * @return the createdDate
	 */
	public Date getCreatedDate() {
		return createdDate;
	}

	/**
	 * @param createdDate
	 *            the createdDate to set
	 */
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	/**
	 * @return the hsGameID
	 */
	public GameStats getHsGameID() {
		return hsGameID;
	}

	/**
	 * @param hsGameID
	 *            the hsGameID to set
	 */
	public void setHsGameID(GameStats hsGameID) {
		this.hsGameID = hsGameID;
	}

	/**
	 * @return the playerColor
	 */
	public Color getPlayerColor() {
		return playerColor;
	}

	/**
	 * @param playerColor
	 *            the playerColor to set
	 */
	public void setPlayerColor(Color playerColor) {
		this.playerColor = playerColor;
	}

	/**
	 * @return the handCards
	 */

	public Player(Date createdDate, GameStats hsGameID, Color playerColor) {
		super();
		this.createdDate = createdDate;
		this.hsGameID = hsGameID;
		this.playerColor = playerColor;

	}

	/**
	 * @return the trainCards
	 */
	public List<TrainCard> getTrainCards() {
		return trainCards;
	}

	/**
	 * @param trainCards
	 *            the trainCards to set
	 */
	public void setTrainCards(List<TrainCard> trainCards) {
		this.trainCards = trainCards;
	}

	/**
	 * @return the destCard
	 */
	public List<DestinationCard> getDestCard() {
		return destCard;
	}

	/**
	 * @param destCard
	 *            the destCard to set
	 */
	public void setDestCard(List<DestinationCard> destCard) {
		this.destCard = destCard;
	}

	public boolean isPlaying() {
		return isPlaying;
	}

	public void setPlaying(boolean isPlaying) {
		this.isPlaying = isPlaying;
	}

}
