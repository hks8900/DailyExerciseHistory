package com.health.study.Service;

import java.util.Date;

import org.springframework.transaction.annotation.Transactional;

import com.health.study.Entity.AeroMeasure;
import com.health.study.Entity.LowerBodyEntity;
import com.health.study.Entity.Member;
import com.health.study.Entity.UpperBodyEntity;
import com.health.study.Repository.ExerciseRepository;

@Transactional
public class ExerciseService {

	private final ExerciseRepository repository;

	public ExerciseService(ExerciseRepository repository) {

		this.repository = repository;
	}

	// UpperBody Data save
	public UpperBodyEntity saveUD(UpperBodyEntity upperBodyE, Member member) {
		System.out.println(member.getId() + " : " + upperBodyE.getWeightTrainingUpper());
		repository.save(upperBodyE, member);
		return upperBodyE;
	}

	// LowerBody Data save
	public LowerBodyEntity saveLD(LowerBodyEntity lowerBodyE, Member member) {
		System.out.println(member.getId() + " : " + lowerBodyE.getWeightTrainingLower());
		repository.save(lowerBodyE, member);
		return lowerBodyE;
	}

	// Aerobic Data save
	public AeroMeasure saveAD(AeroMeasure aeroMeasure, Member member) {
		System.out.println(member.getId() + " : " + aeroMeasure.getAerobic());
		repository.save(aeroMeasure, member);
		return aeroMeasure;

	}

	// get - rest - after 
	// rest - get = resttime
	// after - rest = runningtime
	public Date getTime() {
		Date date = new Date();
		return date;
	}

	public Date runingTime(Date restDate) {
		Date date = new Date();

		if (date.after(restDate)) {
			Long runningTime = date.getTime() - restDate.getTime();
			date.setTime(runningTime);
		}

		return date;
	}

	public Date restTime(Date getDate) {
		Date restT = new Date();
		Long restResult = restT.getTime() - getDate.getTime();
		restT.setTime(restResult);
		return restT;
	}

}
