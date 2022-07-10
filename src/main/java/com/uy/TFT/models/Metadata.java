package com.uy.TFT.models;

import java.util.List;


public class Metadata {
	private String data_version;
	private String match_id;
	private List <String> participants;
	
	public Metadata() {}

	public String getData_version() {
		return data_version;
	}

	public void setData_version(String data_version) {
		this.data_version = data_version;
	}

	public String getMatch_id() {
		return match_id;
	}

	public void setMatch_id(String match_id) {
		this.match_id = match_id;
	}

	public List<String> getParticipants() {
		return participants;
	}

	public void setParticipants(List<String> participants) {
		this.participants = participants;
	}


	
}
