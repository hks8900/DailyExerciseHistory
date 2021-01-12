package com.health.study.Entity;

public class ExerciseList {

	public String[] ChestList() {
		String[] chestList = { "dumbell press", "barbell press", "dumbell fly", "babell fly" };
		return chestList;
	}

	public String[] BackList() {
		String[] backList = { "dead left", "barbell row", "seated row", "cable row" };
		return backList;
	}

	public String[] LowerList() {
		String[] lowerList = { "barbell squat", "dumbellSquat" };
		return lowerList;
	}

	public String[] AerobicList() {
		String[] aerobic = { "running", "cycle" };
		return aerobic;
	}

}
