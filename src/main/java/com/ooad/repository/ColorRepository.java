package com.ooad.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ooad.entity.Color;

public interface ColorRepository extends JpaRepository<Color, Integer> {

}
