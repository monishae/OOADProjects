package com.ooad.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ooad.entity.Route;
/**
 * 
 * @author monishaelumalai
 *
 */
public interface RouteRepository extends
JpaRepository<Route, Integer> {

}
