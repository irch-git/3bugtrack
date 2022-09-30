package com.bugtrack3.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bugtrack3.dao.IProjectRepository;
import com.bugtrack3.entity.ProjectEntity;

@Controller
@RequestMapping("/projects")
public class ProjectController {
	
	@Autowired
	IProjectRepository projRepo;
	
	@GetMapping("/new")
	public String projectForm(Model model) {
		
		ProjectEntity projectFormController = new ProjectEntity();
		model.addAttribute("projectFormHtml", projectFormController);
		
		return "/project/new-project.html";
	}
	
	@PostMapping("/saved")
	public String projectSaved(Model model, ProjectEntity projectFormHtml){
		
		projRepo.save(projectFormHtml);
		
		return "redirect:/projects/new";
	}
}
