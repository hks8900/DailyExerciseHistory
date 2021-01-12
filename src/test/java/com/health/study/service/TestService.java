package com.health.study.service;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.health.study.Entity.Member;
import com.health.study.RepoImpl.ExerciseRepoImpl;
import com.health.study.Service.MemberService;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

public class TestService {
	
//	MemberService memberService;
//	ExerciseRepoImpl exerciseRepository;
//	
//	@BeforeEach
//	public void beforeEach() {
//		exerciseRepository = new ExerciseRepoImpl();
//		memberService = new MemberService(exerciseRepository);
//	}
//	
//	@AfterEach
//	public void afterEach() {
//		exerciseRepository.clearStore();
//	}
//	
//	@Test
//	public void join() {
//		//given 
//		
//		Member member = new Member();
//		member.setName("test11");
//		
//		//when
//		Long saveId = memberService.join(member);
//		
//		//then 
//		Member findMember = exerciseRepository.findById(saveId).get();
//		assertEquals(member.getName(), findMember.getName());
//		
//		System.out.println(findMember.getName());
//	}
//	
//	@Test
//	public void ExceoptionDuplicatedMember() throws Exception{
//	//Given
//	Member member1 = new Member();
//	member1.setName("test14");
//	Member member2 = new Member();
//	member2.setName("test14");
////	//When
//	memberService.join(member1);
//	IllegalStateException e = assertThrows(IllegalStateException.class, () -> memberService.join(member2));
//	//예외 발생해야함
//	System.out.println(e.getMessage().toString());
//	assertThat(e.getMessage()).isEqualTo("이미 있는 회원 입니다.");
//	System.out.println("test"+e.getMessage());
//	
//	}

}
