package com.ooad.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ooad.entity.Maps;
/**
 * 
 * @author monishaelumalai
 *
 */
public interface MapRepository extends JpaRepository<Maps, Integer>  {

}
