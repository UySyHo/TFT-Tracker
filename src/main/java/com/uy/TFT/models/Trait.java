package com.uy.TFT.models;

public class Trait {
	private String name;
	private Integer numUnits;
	private Integer style;
	private Integer tierCurrent;
	private Integer tierTotal;
	
	public Trait() {}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getNumUnits() {
		return numUnits;
	}

	public void setNumUnits(Integer numUnits) {
		this.numUnits = numUnits;
	}

	public Integer getStyle() {
		return style;
	}

	public void setStyle(Integer style) {
		this.style = style;
	}

	public Integer getTierCurrent() {
		return tierCurrent;
	}

	public void setTierCurrent(Integer tierCurrent) {
		this.tierCurrent = tierCurrent;
	}

	public Integer getTierTotal() {
		return tierTotal;
	}

	public void setTierTotal(Integer tierTotal) {
		this.tierTotal = tierTotal;
	}
	
	

}
