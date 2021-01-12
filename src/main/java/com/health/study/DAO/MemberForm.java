package com.health.study.DAO;

import com.health.study.Entity.Member;

public class MemberForm {

	private Long id;

	private String name;

	private String password;

	private String Email;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public Member MemberFormToMember(String name, String password, String email) {
		Member member = new Member();
		member.setName(name);
		member.setPassword(password);
		member.setEmail(email);
		return member;
	}
	
}
