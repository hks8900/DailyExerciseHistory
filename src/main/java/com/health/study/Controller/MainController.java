package com.health.study.Controller;

import java.util.Date;
import java.util.Optional;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.health.study.DAO.ExerciseListForm;
import com.health.study.DAO.MKS_unit;
import com.health.study.DAO.MemberForm;
import com.health.study.DAO.VolumeForm;
import com.health.study.Entity.ExerciseList;
import com.health.study.Entity.Member;
import com.health.study.Entity.UpperBodyEntity;
import com.health.study.Service.ExerciseService;
import com.health.study.Service.MemberService;

@Controller
public class MainController {

	private final MemberService memberService;

	private final ExerciseService exerciseService;

	@Autowired
	public MainController(MemberService memberService, ExerciseService exerciseService) {
		this.memberService = memberService;
		this.exerciseService = exerciseService;
	}

	@GetMapping("login")
	public String login() {
		return "page/login";
	}

	@PostMapping("login")
	public String CheckLogin(MemberForm memberForm, Member member, HttpServletRequest servletRequest) {
		Optional<Member> check = memberService.findMemberByEmail(memberForm.getEmail());
		if (check.isPresent()) {
			servletRequest.getSession().setAttribute("userId", check.get().getId());
			servletRequest.getSession().setAttribute("userName", check.get().getName());
			servletRequest.getSession().setAttribute("userEmail", check.get().getEmail());
			System.out.println("go to main =  " + check.get().getId());
			return "redirect:/main";
		} else {
			return "page/loginFail";
		}
	}

	@GetMapping("main")
	public String Main(Model model, HttpServletRequest httpServletRequest, HttpServletResponse servletResponse) {

		Long num = (Long) httpServletRequest.getSession().getAttribute("userId");
		String userName = (String) httpServletRequest.getSession().getAttribute("userName");
		String userMail = httpServletRequest.getSession().getAttribute("userEmail").toString();
		String userId = num.toString();

		model.addAttribute("userId", userId);
		model.addAttribute("userName", userName);
		model.addAttribute("userEmail", userMail);

		Cookie cookie = new Cookie("userId", userId);
		servletResponse.addCookie(cookie);

		return "layoutFrame/mainFrame";
	}

	@GetMapping("history")
	public String history(MemberForm member) {
		return "page/history";
	}

	// data input Page weight Training
	@GetMapping("inputWeightTraining")
	public String inputData(Model model,@CookieValue(value = "userId",required = false) Cookie cookie ) {

		System.out.println("testing cookie = "+ cookie.getValue());
		
		Member member = new Member();
		VolumeForm volumeForm = new VolumeForm();

		Long num = (long) 1;
		member.setId(num);
		member.setName("tset");

		volumeForm.setGetTime(exerciseService.getTime());

		System.out.println("get Time = " + volumeForm.getGetTime());

		Long id = member.getId();
		String name = member.getName();

		ExerciseList exerciseList = new ExerciseList();

		model.addAttribute("id", id);
		model.addAttribute("name", name);
		model.addAttribute("UpperBodyCategory", exerciseList.ChestList());
		model.addAttribute("LowerListCategory", exerciseList.LowerList());
		model.addAttribute("AerobicCategory", exerciseList.AerobicList());

		return "/page/inputData";
	}

	@PostMapping(value = "inputWTData")
	public String recivedData(VolumeForm volumeForm, MKS_unit category, ExerciseListForm exerciseListForm,
			Member member, HttpServletRequest servletRequest) {
		Long num = (long) 1;
		member.setId(num);
		member.setName("tester1");

		int count = category.getCount();
		int speed = category.getSpeed();
		exerciseListForm.setWeightTrainingUpper("tst_weight");

		System.out.println("post " + volumeForm.getGetTime());

		UpperBodyEntity upperBodyE = new UpperBodyEntity();
		upperBodyE.setWeightTrainingUpper(exerciseListForm.getWeightTrainingUpper());

		exerciseService.saveUD(upperBodyE, member);

		return "redirect:/inputWeightTraining";
	}

	@GetMapping(value = "getRestTime")
	public String getRestTime(Date date, VolumeForm volumeForm) {
		System.out.println(volumeForm.getGetTime());
//		volumeForm.setRestTime(exerciseService.restTime(volumeForm.getGetTime()));
		return "/page/inputData";
	}

	// member
	@GetMapping("registerPage")
	public String resistMember(Model model) {
		return "page/registerPage";
	}

	@PostMapping(value = "/page/registerPage")
	public String inputMember(MemberForm memberForm, Model model) {
		Member join = memberForm.MemberFormToMember(memberForm.getName(), memberForm.getPassword(),
				memberForm.getEmail());

		Long result = memberService.join(join);
		model.addAttribute("answer", result);
		return "redirect:/registerPage";

	}

	@GetMapping("members")
	public String memberList(Model model) {
		model.addAttribute("memberList", memberService.findAllMembers());
		return "page/memberList";
	}

}
