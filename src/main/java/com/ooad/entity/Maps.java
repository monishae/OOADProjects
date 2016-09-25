package com.ooad.entity;

import java.util.List;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
/**
 * Entity for creating a list of maps and its corresponding routes.
 * @author monishaelumalai
 *
 */
@JsonPOJOBuilder
public class Maps {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@JsonProperty("map_id")
	private Integer map_id;
	
	@JsonProperty("map_type")
	private String map_type;
	
	@JsonProperty("map_name")
	private String map_name;
	
	@JsonProperty("map_country")
	private String map_country;
	
	@JsonProperty("map_routes")
	List<Route> map_routes;
	/**
	 * @return the map_id
	 */
	public Integer getMap_id() {
		return map_id;
	}
	/**
	 * @param map_id the map_id to set
	 */
	public void setMap_id(Integer map_id) {
		this.map_id = map_id;
	}
	/**
	 * @return the map_type
	 */
	public String getMap_type() {
		return map_type;
	}
	/**
	 * @param map_type the map_type to set
	 */
	public void setMap_type(String map_type) {
		this.map_type = map_type;
	}
	/**
	 * @return the map_name
	 */
	public String getMap_name() {
		return map_name;
	}
	/**
	 * @param map_name the map_name to set
	 */
	public void setMap_name(String map_name) {
		this.map_name = map_name;
	}
	/**
	 * @return the map_country
	 */
	public String getMap_country() {
		return map_country;
	}
	/**
	 * @param map_country the map_country to set
	 */
	public void setMap_country(String map_country) {
		this.map_country = map_country;
	}
	/**
	 * @return the map_routes
	 */
	public List<Route> getMap_routes() {
		return map_routes;
	}
	/**
	 * @param map_routes the map_routes to set
	 */
	public void setMap_routes(List<Route> map_routes) {
		this.map_routes = map_routes;
	}
	
}
