package com.uy.TFT.models;


import java.util.List;

public class Participant {
	private List<Trait> traits;
	private Companion companions;
	private List<Unit> units;

	public Participant(){

		
	}
	


	public List<Trait> getTraits() {
		return traits;
	}


	public void setTraits(List<Trait> traits) {
		this.traits = traits;
	}




	public List<Unit> getUnits() {
		return units;
	}


	public void setUnits(List<Unit> units) {
		this.units = units;
	}


	public Companion getCompanions() {
		return companions;
	}


	public void setCompanions(Companion companions) {
		this.companions = companions;
	}
	
}
