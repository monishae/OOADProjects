package com.ooad.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;

/**
 * Get Credit details of developers
 * @author monishaelumalai
 *
 */
@JsonPOJOBuilder
public class Credits {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@JsonProperty("credit_id")
	private Integer credit_id;
	
	@JsonProperty("credit_name")
	private String credit_name;
	
	@JsonProperty("credit_desc")
	private String credit_desc;
	
	@JsonProperty("credit_role")
	private String credit_role;
	/**
	 * @return the credit_id
	 */
	public Integer getCredit_id() {
		return credit_id;
	}
	/**
	 * @param credit_id the credit_id to set
	 */
	public void setCredit_id(Integer credit_id) {
		this.credit_id = credit_id;
	}
	/**
	 * @return the credit_name
	 */
	public String getCredit_name() {
		return credit_name;
	}
	/**
	 * @param credit_name the credit_name to set
	 */
	public void setCredit_name(String credit_name) {
		this.credit_name = credit_name;
	}
	/**
	 * @return the credit_desc
	 */
	public String getCredit_desc() {
		return credit_desc;
	}
	/**
	 * @param credit_desc the credit_desc to set
	 */
	public void setCredit_desc(String credit_desc) {
		this.credit_desc = credit_desc;
	}
	/**
	 * @return the credit_role
	 */
	public String getCredit_role() {
		return credit_role;
	}
	/**
	 * @param credit_role the credit_role to set
	 */
	public void setCredit_role(String credit_role) {
		this.credit_role = credit_role;
	}
	
	

}
