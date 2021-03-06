package com.ooad.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
/**
 * Entity to create individual routes for the map.
 * @author monishaelumalai
 *
 */
@JsonPOJOBuilder
public class Route {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@JsonProperty("Route_id")
	private Integer Route_id;
	
	@JsonProperty("Route_name")
	private String Route_name;
	
	@JsonProperty("Source_id")
	private Integer Source_id;
	
	@JsonProperty("Source_name")
	private String Source_name;
	
	@JsonProperty("Dest_id")
	private Integer Dest_id;
	
	@JsonProperty("Dest_name")
	private String Dest_name;
	
	@JsonProperty("Route_length")
	private Integer Route_length;
	
	@JsonProperty("route_color")
	private Color route_color;
	
	@JsonProperty("routeOwner")
	private Player routeOwner;
	
	/**
	 * @return the route_id
	 */
	public Integer getRoute_id() {
		return Route_id;
	}
	/**
	 * @param route_id the route_id to set
	 */
	public void setRoute_id(Integer route_id) {
		Route_id = route_id;
	}
	/**
	 * @return the route_name
	 */
	public String getRoute_name() {
		return Route_name;
	}
	/**
	 * @param route_name the route_name to set
	 */
	public void setRoute_name(String route_name) {
		Route_name = route_name;
	}
	/**
	 * @return the source_id
	 */
	public Integer getSource_id() {
		return Source_id;
	}
	/**
	 * @param source_id the source_id to set
	 */
	public void setSource_id(Integer source_id) {
		Source_id = source_id;
	}
	/**
	 * @return the source_name
	 */
	public String getSource_name() {
		return Source_name;
	}
	/**
	 * @param source_name the source_name to set
	 */
	public void setSource_name(String source_name) {
		Source_name = source_name;
	}
	/**
	 * @return the dest_id
	 */
	public Integer getDest_id() {
		return Dest_id;
	}
	/**
	 * @param dest_id the dest_id to set
	 */
	public void setDest_id(Integer dest_id) {
		Dest_id = dest_id;
	}
	/**
	 * @return the dest_name
	 */
	public String getDest_name() {
		return Dest_name;
	}
	/**
	 * @param dest_name the dest_name to set
	 */
	public void setDest_name(String dest_name) {
		Dest_name = dest_name;
	}
	/**
	 * @return the route_length
	 */
	public Integer getRoute_length() {
		return Route_length;
	}
	/**
	 * @param route_length the route_length to set
	 */
	public void setRoute_length(Integer route_length) {
		Route_length = route_length;
	}
	/**
	 * @return the route_color
	 */
	public Color getRoute_color() {
		return route_color;
	}
	/**
	 * @param route_color the route_color to set
	 */
	public void setRoute_color(Color route_color) {
		this.route_color = route_color;
	}
	/**
	 * @return the routeOwner
	 */
	public Player getRouteOwner() {
		return routeOwner;
	}
	/**
	 * @param routeOwner the routeOwner to set
	 */
	public void setRouteOwner(Player routeOwner) {
		this.routeOwner = routeOwner;
	}
	
	
	

}
