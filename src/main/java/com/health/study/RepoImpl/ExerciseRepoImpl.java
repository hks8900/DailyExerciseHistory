package com.health.study.RepoImpl;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;

import com.health.study.Entity.AeroMeasure;
import com.health.study.Entity.LowerBodyEntity;
import com.health.study.Entity.Member;
import com.health.study.Entity.UpperBodyEntity;
import com.health.study.Repository.ExerciseRepository;

public class ExerciseRepoImpl implements ExerciseRepository {

	private final EntityManager em;

	public ExerciseRepoImpl(EntityManager em) {
		this.em = em;
	}

	public Member save(Member member) {
		em.persist(member);
		return member;
	}

	public Optional<Member> findById(Long id) {
		Member member = em.find(Member.class, id);
		return Optional.ofNullable(member);
	}

	public List<Member> findAll() {
		return em.createQuery("select m from Member m", Member.class).getResultList();
	}

	public Optional<Member> findByName(String name) {
		List<Member> result = em.createQuery("select m from Member m where	m.name = :name", Member.class)
				.setParameter("name", name).getResultList();
		return result.stream().findAny();
	}

	public Optional<Member> findByEmail(String Email) {
		List<Member> result = em.createQuery("select m from Member m where m.Email = :Email", Member.class)
				.setParameter("Email", Email).getResultList();
		return result.stream().findAny();
	}

//----------------------exercise

	@Override
	public AeroMeasure save(AeroMeasure aeroMeasure, Member member) {
		Long id = member.getId();
		aeroMeasure.setId(id);
//		storeAe.put(id, aeroMeasure);
		em.persist(aeroMeasure);
		return aeroMeasure;
	}

	@Override
	public UpperBodyEntity save(UpperBodyEntity upperBodyE, Member member) {
		Long id = member.getId();
		upperBodyE.setId(id);
//		storeUpper.put(id, upperBodyE);
		em.persist(upperBodyE);
		return upperBodyE;
	}

	@Override
	public LowerBodyEntity save(LowerBodyEntity lowerBodyE, Member member) {
		Long id = member.getId();
		lowerBodyE.setId(member.getId());
//		storeLo.put(id, lowerBodyE);
		em.persist(lowerBodyE);
		return lowerBodyE;
	}

}
