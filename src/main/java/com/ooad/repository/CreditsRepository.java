package com.ooad.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ooad.entity.Credits;
/**
 * 
 * @author monishaelumalai
 *
 */
@Repository
public interface CreditsRepository extends JpaRepository<Credits, Integer>{

}
