package com.ooad.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ooad.entity.Color;
/**
 * @version 
 * @author monishaelumalai
 *
 */
@Repository
public interface ColorRepository extends JpaRepository<Color, Integer> {

}
