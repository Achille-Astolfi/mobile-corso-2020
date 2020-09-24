package com.example.corso.mobile.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.corso.mobile.viewmodel.LoginFormBean;

@Controller
@RequestMapping("/login")
public class LoginController {
	@GetMapping
	public String getPage(Model model) {
		LoginFormBean formBean = new LoginFormBean();
		model.addAttribute("formBean", formBean);
		return "login";
	}

	@PostMapping
	public String postPage(@ModelAttribute LoginFormBean formBean, Model model) {
		model.addAttribute("formBean", formBean);
		return "login-ok";
	}
}
