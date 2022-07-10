package com.uy.TFT.controllers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.uy.TFT.models.Leaderboard;
import com.uy.TFT.models.ListOfMatchesId;
import com.uy.TFT.models.TftMatch;
import com.uy.TFT.models.SearchModel;
import com.uy.TFT.models.Summoner;
import com.uy.TFT.services.RiotApiService;

@Controller
public class TftController {
	@GetMapping("/")
	public String tft(SearchModel searchModel, Model model, BindingResult resultl) {
		RiotApiService riotApiService = new RiotApiService();
		model.addAttribute("search", new SearchModel());
		Leaderboard searchLeaderboard = null;
		try {
			searchLeaderboard = riotApiService.getLeaderboard();
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// serves back to request
		model.addAttribute("searchLeaderboard", searchLeaderboard);
		return "tft.jsp";
		
	}
	
	
	@PostMapping("/search")
	public String register(@Valid @ModelAttribute("search") SearchModel searchModel, Model model, BindingResult result) throws JsonMappingException, JsonProcessingException {
		RiotApiService riotApiService = new RiotApiService();
		ArrayList<TftMatch> listOfMatches;
		Summoner searchSummoner = null;
		try {
			searchSummoner = riotApiService.getSummonerByName2(searchModel.getSummonerName());
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String[] listOfMatchIds = riotApiService.getMatchIdsByPuuid(searchSummoner.getPuuid());
		model.addAttribute("getMatchByPuuid", listOfMatchIds);
		
		for(int i = 0; i < listOfMatchIds.length; i++) {
			
//			listOfMatches.add(getMatchId);
			
			
			
		}
		
		TftMatch getMatchById = riotApiService.getMatchById("NA1_4336271090");
		model.addAttribute("searchSummoner", searchSummoner);
		model.addAttribute("getMatchById", getMatchById);
		

		return "show.jsp";
		
	}
	
	@GetMapping("/myprofile")
	public String myProfile(SearchModel searchModel, Model model, BindingResult resultl)
	{
		RiotApiService riotApiService = new RiotApiService();
		model.addAttribute("search", new SearchModel());
		Leaderboard searchLeaderboard = null;
		try {
			searchLeaderboard = riotApiService.getLeaderboard();
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// serves back to request
		model.addAttribute("searchLeaderboard", searchLeaderboard);
		return "myprofile.jsp";
	}
	
//	@PostMapping("/coaches")
//	public String coach(@Valid @ModelAttribute("coaches") SearchModel searchModel, Model model, BindingResult result)
//	{
//		RiotApiService riotApiService = new RiotApiService();
//		
//		List<HashMap<String, String>> searchCoaches = getMockListOfCoaches();
//		
//		model.addAttribute("searchCoaches", searchCoaches);
//		return "coaches.jsp";
//	}
	
//	public List<HashMap<String, String>> getMockListOfCoaches(){
//		List<HashMap<String, String>> results = new ArrayList<HashMap<String, String>>();
//		
//		//each hashmap should have name, rank, lp, then add to results
//		HashMap<String, String> example1 = new HashMap<String, String>();
//		example1.put("name", "dress");
//		example1.put("rank", "challenger");
//		example1.put("lp", "2500");
//		results.add(example1);
//		
//		return results;
//	}

}