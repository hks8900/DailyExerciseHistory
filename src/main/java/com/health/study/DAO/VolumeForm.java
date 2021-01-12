package com.health.study.DAO;

import java.util.Date;

public class VolumeForm {

	private int count;
	private int weight;
	private int weightSet;
	
	Date getTime;
	Date weightTime;
	Date restTime;
	
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getWeightSet() {
		return weightSet;
	}
	public void setWeightSet(int weightSet) {
		this.weightSet = weightSet;
	}
	public Date getWeightTime() {
		return weightTime;
	}
	public void setWeightTime(Date weightTime) {
		this.weightTime = weightTime;
	}
	public Date getRestTime() {
		return restTime;
	}
	public void setRestTime(Date restTime) {
		this.restTime = restTime;
	}
	public Date getGetTime() {
		return getTime;
	}
	public void setGetTime(Date getTime) {
		this.getTime = getTime;
	}
	
	
}
