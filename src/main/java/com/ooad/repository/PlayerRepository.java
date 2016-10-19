package com.ooad.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ooad.entity.Color;
import com.ooad.entity.Player;
@Repository
public interface PlayerRepository extends JpaRepository<Player, Integer>{

}


