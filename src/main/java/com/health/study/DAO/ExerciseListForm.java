package com.health.study.DAO;

public class ExerciseListForm {

	private Long id;

	private String weightTrainingUpper;
	private String weightTrainingLower;
	private String aerobic;

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

	public String getWeightTrainingLower() {
		return weightTrainingLower;
	}

	public void setWeightTrainingLower(String weightTrainingLower) {
		this.weightTrainingLower = weightTrainingLower;
	}

	public String getAerobic() {
		return aerobic;
	}

	public void setAerobic(String aerobic) {
		this.aerobic = aerobic;
	}

}
