package com.uy.TFT.controllers;

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

import com.uy.TFT.models.Leaderboard;
import com.uy.TFT.models.SearchModel;
import com.uy.TFT.services.RiotApiService;

@Controller
public class TftController {
	@GetMapping("/tft")
	public String tft(SearchModel searchModel, Model model, BindingResult resultl) {
		RiotApiService riotApiService = new RiotApiService();
		model.addAttribute("search", new SearchModel());
		Leaderboard searchLeaderboard = riotApiService.getLeaderboard();
		model.addAttribute("searchLeaderboard", searchLeaderboard);
		return "tft.jsp";
		
	}
	
	
	@PostMapping("/search")
	public String register(@Valid @ModelAttribute("search") SearchModel searchModel, Model model, BindingResult result) {
		RiotApiService riotApiService = new RiotApiService();
		Map<String, String> searchSummoner = riotApiService.getSummonerByName(searchModel.getSummonerName());
//		List<HashMap<String, String>> searchMatchHistory = riotApiService.getMatchHistoryByName(searchModel.getSummonerName());
		model.addAttribute("searchSummoner", searchSummoner);
//		model.addAttribute("searchMatchHistory", searchMatchHistory);
		return "show.jsp";

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