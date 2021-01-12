package com.health.study.Entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.apache.tomcat.jni.Time;

@Entity
public class AeroMeasure {
	@Id
	private Long id;
	@Column
	private String aerobic;
	@Column
	private int speed;
	@Column
	private Date weightTime;
	@Column
	private Date restTime;

	public Long getId() {
		return id;
	}

	public String getAerobic() {
		return aerobic;
	}

	public void setAerobic(String aerobic) {
		this.aerobic = aerobic;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
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
