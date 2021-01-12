package com.health.study.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.transaction.annotation.Transactional;

import com.health.study.Entity.Member;
import com.health.study.Repository.ExerciseRepository;

@Transactional
public class MemberService {

//	private final ExerciseRepoImpl repoImpl = new ExerciseRepoImpl();

//	private final ExerciseRepository repository = new ExerciseRepoImpl();

	private final ExerciseRepository repository;

	public MemberService(ExerciseRepository repository) {
		this.repository = repository;
	}

	// join
	public Long join(Member member) {
		// check Duplicate
//		validateDuplicateMember(member);
		String answer;
		if (memberDulicateCheck(member)) {
			answer = "exsistedMember";
		} else {
			repository.save(member);
			answer = "welcome";
		}

		return member.getId();
	}

	private boolean memberDulicateCheck(Member member) {
		System.out.println(member.getName());
		Optional<Member> name = repository.findByName(member.getName());
		name.ifPresent(m -> {
			throw new IllegalStateException("이미 존재하는 회원입니다.");
		});

		return name.isPresent();
	}

	// Search All Member
	public List<Member> findAllMembers() {
		return repository.findAll();
	}

	// Find a Member
	public Optional<Member> findOne(Long memberId) {
		return repository.findById(memberId);
	}

	public Optional<Member> findMemberByEmail(String Email) {
		return repository.findByEmail(Email);
	}

}
