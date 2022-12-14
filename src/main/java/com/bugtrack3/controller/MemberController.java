package com.bugtrack3.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bugtrack3.dao.IMemberRepository;
import com.bugtrack3.entity.MemberEntity;

@Controller
@RequestMapping("/members")
public class MemberController {
	
	@Autowired
	IMemberRepository memRepo;
	
	@GetMapping("/new")
	public String displayMember(Model model) {
		
		MemberEntity aMember = new MemberEntity();
		
		model.addAttribute("memberHTML", aMember);
		
		return "/member/new-member";
	}
	
	@PostMapping("/saved")
	public String displayMember(Model model, MemberEntity aMember) {
		
		memRepo.save(aMember);
		
		return "redirect:/members/new";
	}
}
