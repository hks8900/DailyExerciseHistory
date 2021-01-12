package com.health.study.DAO;

import org.apache.tomcat.jni.Time;

public class AeroMeasureForm {

	private int speed;

	private Time weightTime;
	private Time restTime;
	
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public Time getWeightTime() {
		return weightTime;
	}
	public void setWeightTime(Time weightTime) {
		this.weightTime = weightTime;
	}
	public Time getRestTime() {
		return restTime;
	}
	public void setRestTime(Time restTime) {
		this.restTime = restTime;
	}
	
	
	
}
