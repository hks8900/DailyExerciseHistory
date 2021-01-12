package com.health.study.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.health.study.Entity.AeroMeasure;
import com.health.study.Entity.ExerciseList;
import com.health.study.Entity.LowerBodyEntity;
import com.health.study.Entity.Member;
import com.health.study.Entity.UpperBodyEntity;

public interface ExerciseRepository {

	Member save(Member member);

	Optional<Member> findById(Long id);

	Optional<Member> findByName(String name);
	
	public Optional<Member> findByEmail(String Email);

	List<Member> findAll();

//	Optional<exerciseList> 

	UpperBodyEntity save(UpperBodyEntity upperBodyE, Member member);
	
	LowerBodyEntity save(LowerBodyEntity lowerBodyE, Member member);

	AeroMeasure save(AeroMeasure aeroMeasure, Member member);
}
