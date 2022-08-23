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
import com.fasterxml.jackson.databind.deser.DataFormatReaders.Match;
import com.uy.TFT.models.ChallengerPlayer;
import com.uy.TFT.models.Leaderboard;
import com.uy.TFT.models.Participant;
import com.uy.TFT.models.Summoner;
import com.uy.TFT.models.TftMatch;

@Service
public class RiotApiService {

	private String server = "http://localhost:8080";
	private RestTemplate rest;
	private HttpHeaders headers;
	private HttpStatus status;

	private String apiKey = "RGAPI-1237b962-a070-4e9f-8400-f91de65d492d";
 

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

				"https://na1.api.riotgames.com/tft/league/v1/challenger?api_key=" + apiKey, String.class);
		return result;

	}

	public Map<String, String> getSummonerByName(String name) {


		String url = String
				.format("https://na1.api.riotgames.com/tft/summoner/v1/summoners/by-name/%s?api_key=" + apiKey, name);

		ParameterizedTypeReference<HashMap<String, String>> responseType = new ParameterizedTypeReference<HashMap<String, String>>() {
		};
		RequestEntity<Void> request = RequestEntity.get(url).accept(MediaType.APPLICATION_JSON).build();
		Map<String, String> jsonDictionary = rest.exchange(request, responseType).getBody();

		return jsonDictionary;

	}

	public Summoner getSummonerByName2(String name) throws JsonMappingException, JsonProcessingException {
		ObjectMapper objectMapper = new ObjectMapper();

		String url = String
				.format("https://na1.api.riotgames.com/tft/summoner/v1/summoners/by-name/%s?api_key=" + apiKey, name);
		ParameterizedTypeReference<String> responseType = new ParameterizedTypeReference<String>() {
		};
		RequestEntity<Void> request = RequestEntity.get(url).accept(MediaType.APPLICATION_JSON).build();
		String json = rest.exchange(request, responseType).getBody();
		System.out.println(json);
		Summoner summoner = objectMapper.readValue(json, Summoner.class);

		return summoner;

	}

	public Leaderboard getLeaderboard() throws JsonMappingException, JsonProcessingException {

		ObjectMapper objectMapper = new ObjectMapper();

		List<ChallengerPlayer> players = new ArrayList<ChallengerPlayer>();

		String url = "https://na1.api.riotgames.com/tft/league/v1/rated-ladders/RANKED_TFT_TURBO/top?api_key=" + apiKey;

		ParameterizedTypeReference<String> responseType = new ParameterizedTypeReference<String>() {
		};
		RequestEntity<Void> request = RequestEntity.get(url).accept(MediaType.APPLICATION_JSON).build();

		String json = rest.exchange(request, responseType).getBody();
		System.out.println(json);

		// Long winPercentageTwentyGames =
		// getWinPercentage(player.get("summonerId").toString(), 20);
		ChallengerPlayer[] myObjects = objectMapper.readValue(json, ChallengerPlayer[].class);
		Leaderboard leaderboard = new Leaderboard(myObjects);
		

		return leaderboard;
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
//	


	public TftMatch getMatchById(String matchId) throws JsonMappingException, JsonProcessingException {
		// code here to call riot API for match details by match id
		
		ObjectMapper objectMapper = new ObjectMapper();
		

		String url = "https://americas.api.riotgames.com/tft/match/v1/matches/"+ matchId + "/?api_key=" + apiKey;

		ParameterizedTypeReference<String> responseType = new ParameterizedTypeReference<String>() {
		};
		RequestEntity<Void> request = RequestEntity.get(url).accept(MediaType.APPLICATION_JSON).build();
		String json = rest.exchange(request, responseType).getBody();
		System.out.println(json);
		TftMatch match = objectMapper.readValue(json, TftMatch.class);
		
		return match;
	}
	
	
	public String[] getMatchIdsByPuuid(String puuid) throws JsonMappingException, JsonProcessingException {
		// code here to call riot API for match details by match id
		
		ObjectMapper objectMapper = new ObjectMapper();
		

		String url = "https://americas.api.riotgames.com/tft/match/v1/matches/by-puuid/" + puuid + "/ids" + "/?api_key=" + apiKey;

		ParameterizedTypeReference<String> responseType = new ParameterizedTypeReference<String>() {
		};
		RequestEntity<Void> request = RequestEntity.get(url).accept(MediaType.APPLICATION_JSON).build();
		String json = rest.exchange(request, responseType).getBody();
		System.out.println(json);
		String[] matchIds = objectMapper.readValue(json, String[].class);
		
		return matchIds;
	}
	
	
	

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
