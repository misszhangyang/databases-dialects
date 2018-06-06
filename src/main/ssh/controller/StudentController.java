package main.ssh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import main.ssh.entity.Student;

@Controller
public class StudentController {

	@RequestMapping(value = "register")
	public String register(@ModelAttribute("form") Student student, Model model) {
		model.addAttribute("student", student);
		return "result";
	}
	
}
