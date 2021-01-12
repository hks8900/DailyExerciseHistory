package com.health.study.Entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.apache.tomcat.jni.Time;

@Entity
public class LowerBodyEntity {
	@Id
	private Long id;
	@Column
	private String weightTrainingLower;
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

	public String getWeightTrainingLower() {
		return weightTrainingLower;
	}

	public void setWeightTrainingLower(String weightTrainingLower) {
		this.weightTrainingLower = weightTrainingLower;
	}

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
}
