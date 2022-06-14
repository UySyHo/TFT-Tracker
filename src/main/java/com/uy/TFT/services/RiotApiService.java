package com.uy.TFT.services;

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

import com.uy.TFT.models.Leaderboard;

@Service
public class RiotApiService {

	private String server = "http://localhost:8080";
	private RestTemplate rest;
	private HttpHeaders headers;
	private HttpStatus status;
	private String apiKey = "RGAPI-465d3fe3-b57f-4539-99fe-2be4a5307a6e";
	

	// CONSTRUCTOR
	public RiotApiService() {
		this.rest = new RestTemplate();
		this.headers = new HttpHeaders();
		headers.add("Content-Type", "application/json");
		headers.add("Accept", "*/*");
		headers.add("Accept-Language", "en-US,en;q=0.9");
		headers.add("Accept-Charset", "application/x-www-form-urlencoded; charset=UTF-8");
		headers.add("X-Riot-Token", "RGAPI-465d3fe3-b57f-4539-99fe-2be4a5307a6e");
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
	
	public List<HashMap<String, String>> getLeaderboard() {
		

		String url = "https://na1.api.riotgames.com/tft/league/v1/rated-ladders/RANKED_TFT_TURBO/top?api_key=" + apiKey;
		
		ParameterizedTypeReference<List<HashMap<String, String>>>responseType = new ParameterizedTypeReference<List<HashMap<String, String>>>() {
		};
		RequestEntity<Void> request = RequestEntity.get(url).accept(MediaType.APPLICATION_JSON)
				.build();
		List<HashMap<String, String>> jsonDictionary = rest.exchange(request, responseType).getBody();
		
		return jsonDictionary;
		
	}
	
}
