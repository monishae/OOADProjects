package com.ooad.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.ooad.entity.GameStats;
@Repository
public interface GameStatsRepository extends JpaRepository<GameStats, Integer>{
	
	

}
