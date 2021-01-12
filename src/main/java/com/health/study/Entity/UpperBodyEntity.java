package com.health.study.Entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class UpperBodyEntity {
	@Id
	private Long id;
	@Column
	private String weightTrainingUpper;
	@Column
	private int count;
	@Column
	private int weight;
	@Column
	private int weightSet;

	
	Date weightTime;
	Date restTime;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getWeightTrainingUpper() {
		return weightTrainingUpper;
	}

	public void setWeightTrainingUpper(String weightTrainingUpper) {
		this.weightTrainingUpper = weightTrainingUpper;
	}

	public int getWeightCount() {
		return count;
	}

	public void setWeightCount(int count) {
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

}
