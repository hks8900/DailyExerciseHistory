package com.health.study.Config;

import javax.persistence.EntityManager;
import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.health.study.RepoImpl.ExerciseRepoImpl;
import com.health.study.Repository.ExerciseRepository;
import com.health.study.Service.ExerciseService;
import com.health.study.Service.MemberService;

@Configuration
public class Config {
	private final EntityManager em;

	public Config( EntityManager em) {
		this.em = em;
	}

	@Bean
	public ExerciseRepository exerciseRepository() {
//		return new ExerciseRepoImpl();
		return new ExerciseRepoImpl(em);
	}

	@Bean
	public MemberService memberService() {
		return new MemberService(exerciseRepository());

	}

	@Bean
	public ExerciseService exerciseService() {
		return new ExerciseService(exerciseRepository());
	}

}
