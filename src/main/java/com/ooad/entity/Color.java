package com.ooad.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Color {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer Color_id;
	private String Color_name;
	private Integer Color_value;
	/**
	 * @return the color_id
	 */
	public Integer getColor_id() {
		return Color_id;
	}
	/**
	 * @param color_id the color_id to set
	 */
	public void setColor_id(Integer color_id) {
		Color_id = color_id;
	}
	/**
	 * @return the color_name
	 */
	public String getColor_name() {
		return Color_name;
	}
	/**
	 * @param color_name the color_name to set
	 */
	public void setColor_name(String color_name) {
		Color_name = color_name;
	}
	/**
	 * @return the color_value
	 */
	public Integer getColor_value() {
		return Color_value;
	}
	/**
	 * @param color_value the color_value to set
	 */
	public void setColor_value(Integer color_value) {
		Color_value = color_value;
	}
	
	

}
