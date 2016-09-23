package com.ooad.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ooad.entity.Maps;
import com.ooad.repository.ColorRepository;
import com.ooad.repository.CreditsRepository;
import com.ooad.repository.MapRepository;
import com.ooad.repository.RouteRepository;

/**
 * 
 * @author monishaelumalai
 *
 */

@RestController
@RequestMapping("/api/v1")
public class GameController {

	@Autowired
	private MapRepository mapRepo;
	private RouteRepository routeRepo;
	private CreditsRepository creditRepo;
	private ColorRepository colorRepo;
	
	private final static Logger LOGGER = Logger
			.getLogger(GameController.class.getName());

	@RequestMapping(value = "/test", method = RequestMethod.GET)
	@ResponseBody
	public String test() {
		return "Hi";
	}

	/**
	 * get all the existing maps from the database.
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/allmaps", produces = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.GET)
	public List<Maps> allProfiles() throws Exception{
		LOGGER.info("Getting all the existing maps");
		List<Maps> allMaps = mapRepo.findAll();
		LOGGER.info("Found all the maps");
		return allMaps;
	}

	/*@RequestMapping(value = "/candidateprofiles/{id}", produces = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.GET)
	public CandidateProfile findOneProfile(
			@PathVariable(value = "id") Integer id) throws HROnboardingException{
		LOGGER.info("Getting the candidate profiles for id:" + id);
		CandidateProfile candidateProfiles = repo.findOne(id);
		LOGGER.info("Found the following profiles:" + candidateProfiles);
		return candidateProfiles;
	}*/

	/**
	 * 
	 * @param map
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/map", consumes = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.POST)
	@ResponseBody
	public HttpStatus saveProfile(@RequestBody Maps map) throws Exception{
		LOGGER.info("Saving the map data:"+ map);
		mapRepo.save(map);
		return HttpStatus.CREATED;
	}

	/*
	 * @RequestMapping(value="/candidateprofiles/{id}",
	 * consumes=MediaType.APPLICATION_JSON_VALUE, method=RequestMethod.PUT)
	 * public CandidateProfile updateProfile(@PathVariable(value="id") Integer
	 * id, @RequestBody CandidateProfile candidate){
	 * candidate.setCandidate_id(id); return repo.save(candidate); }
	 * 
	 * @RequestMapping(value="/candidateprofiles/{id}",
	 * consumes=MediaType.APPLICATION_JSON_VALUE, method=RequestMethod.DELETE)
	 * public CandidateProfile deleteProfile(@PathVariable(value="id") Integer
	 * id){ CandidateProfile candidate = repo.findOne(id);
	 * repo.delete(candidate); return candidate; }
	 */
	
	
//	@RequestMapping(value = "/getExcelData", produces = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.GET)
//	public List<UtilEntity> findOneRow() throws Exception {
//		List<UtilEntity> utilList = new ArrayList<UtilEntity>();
//
//	//	ExcelToDB excelConv = new ExcelToDB();
//	//	excelConv.findExcel();
//		utilList = repo.findAll();
//		return utilList;
//
//	}

}
