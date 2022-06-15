package com.uy.TFT.services;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.hibernate.annotations.Any;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.RequestEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.uy.TFT.models.ChallengerPlayer;
import com.uy.TFT.models.Leaderboard;
import com.uy.TFT.models.Summoner;

@Service
public class RiotApiService {

	private String server = "http://localhost:8080";
	private RestTemplate rest;
	private HttpHeaders headers;
	private HttpStatus status;
	private String apiKey = "RGAPI-f9bf73b0-2c91-4661-82f8-c8af4d9d5d1e";
	

	// CONSTRUCTOR
	public RiotApiService() {
		this.rest = new RestTemplate();
		this.headers = new HttpHeaders();
		headers.add("Content-Type", "application/json");
		headers.add("Accept", "*/*");
		headers.add("Accept-Language", "en-US,en;q=0.9");
		headers.add("Accept-Charset", "application/x-www-form-urlencoded; charset=UTF-8");
		headers.add("X-Riot-Token", apiKey);
	}

	public String getTFT() {
		String result = rest.getForObject(

				"https://na1.api.riotgames.com/tft/league/v1/challenger?api_key=" + apiKey,
				String.class);
		return result;

	}

	public Map<String, String> getSummonerByName(String name) {
		
		String url = String.format(
				"https://na1.api.riotgames.com/tft/summoner/v1/summoners/by-name/%s?api_key=" + apiKey,
				name);
		
		
		ParameterizedTypeReference<HashMap<String, String>> responseType = new ParameterizedTypeReference<HashMap<String, String>>() {
		};
		RequestEntity<Void> request = RequestEntity.get(url).accept(MediaType.APPLICATION_JSON)
				.build();
		Map<String, String> jsonDictionary = rest.exchange(request, responseType).getBody();
		
		return jsonDictionary;
		
	}

    public Summoner getSummonerByName2(String name) throws JsonMappingException, JsonProcessingException {
		ObjectMapper objectMapper = new ObjectMapper();
		
        
		String url = String.format(
				"https://na1.api.riotgames.com/tft/summoner/v1/summoners/by-name/%s?api_key=" + apiKey,
				name);
		
		
		ParameterizedTypeReference<String> responseType = new ParameterizedTypeReference<String>() {
		};
		RequestEntity<Void> request = RequestEntity.get(url).accept(MediaType.APPLICATION_JSON)
				.build();
		String json = rest.exchange(request, responseType).getBody();
		
		System.out.println(json);
		
		Summoner summoner = objectMapper.readValue(json, Summoner.class);
		
		return summoner;
		
	}
	
	public Leaderboard getLeaderboard() {
		List<ChallengerPlayer> players = new ArrayList<ChallengerPlayer>();
		
		String url = "https://na1.api.riotgames.com/tft/league/v1/rated-ladders/RANKED_TFT_TURBO/top?api_key=" + apiKey;
		
		ParameterizedTypeReference<List<HashMap<String, Object>>>responseType = new ParameterizedTypeReference<List<HashMap<String, Object>>>() {
		};
		RequestEntity<Void> request = RequestEntity.get(url).accept(MediaType.APPLICATION_JSON)
				.build();
		
		List<HashMap<String, Object>> jsonDictionary = rest.exchange(request, responseType).getBody();
		
		for(HashMap<String, Object> player : jsonDictionary) {
			//Long winPercentageTwentyGames = getWinPercentage(player.get("summonerId").toString(), 20);
			players.add(
				new ChallengerPlayer(
					player.get("summonerId").toString(),
					player.get("summonerName").toString(),
					player.get("ratedTier").toString(),
					(Integer) player.get("ratedRating"),
					(Integer) player.get("wins"),
					(Integer) player.get("previousUpdateLadderPosition")
				)
			);
		}
		return new Leaderboard(players);
	}
	
//	public List<HashMap<String, String>> getMatchHistoryByName(String summonerName) {
//		// set up data structure to store our expected results
//		List<HashMap<String, String>> results = new ArrayList();
//		
//		// call riot API for match history by player name; this is going to return a list of match id's
//		String url = String.format(
//				"get url from riot api" + apiKey,
//				summonerName);
//		ParameterizedTypeReference<List<HashMap<String, String>>>responseType = new ParameterizedTypeReference<List<HashMap<String, String>>>() {
//		};
//		RequestEntity<Void> request = RequestEntity.get(url).accept(MediaType.APPLICATION_JSON).build();
//		List<HashMap<String, String>> response = rest.exchange(request, responseType).getBody();
//		
//		// loop through all matches, get their match id, call riot API for individual matches
//		for(HashMap<String, String> match : response) {
//			if(match.containsKey("matchId")) {
//				results.add(getMatchById(match.get("matchId")));
//			}
//		}
//		
//		return results;
//	}
	
//	public HashMap<String, String> getMatchById(String id){
//		// code here to call riot API for match details by match id
//		
//		String url = String.format(
//				"get url from riot api" + apiKey,
//				id);
//		
//		ParameterizedTypeReference<HashMap<String, String>> responseType = new ParameterizedTypeReference<HashMap<String, String>>() {
//		};
//		RequestEntity<Void> request = RequestEntity.get(url).accept(MediaType.APPLICATION_JSON).build();
//		
//		HashMap<String, String> jsonDictionary = rest.exchange(request, responseType).getBody();
//				
//		return jsonDictionary;
//	}
	
	
//	public Double getWinPercentage(String summonerName, Integer totalGames) {
//		// code here to get the last 20 matches from riot api
//		
//		// loop through each match, count how many times the summoner place first?
//		
//		// divide count by 20
//		
//		return 100.00;
//	}
}
