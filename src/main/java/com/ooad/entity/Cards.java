package com.ooad.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;

@JsonPOJOBuilder
public class Cards {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@JsonProperty("cardId")
	private int cardId;
	
	@JsonProperty("cardType")
	private String cardType;
	
	
	/**
	 * @return the cardId
	 */
	public int getCardId() {
		return cardId;
	}
	/**
	 * @param cardId the cardId to set
	 */
	public void setCardId(int cardId) {
		this.cardId = cardId;
	}
	/**
	 * @return the cardType
	 */
	public String getCardType() {
		return cardType;
	}
	/**
	 * @param cardType the cardType to set
	 */
	public void setCardType(String cardType) {
		this.cardType = cardType;
	}

	
}
