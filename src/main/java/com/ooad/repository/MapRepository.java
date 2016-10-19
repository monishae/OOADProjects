package com.ooad.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ooad.entity.Maps;
/**
 * 
 * @author monishaelumalai
 *
 */
@Repository
public interface MapRepository extends JpaRepository<Maps, Integer>  {

}
