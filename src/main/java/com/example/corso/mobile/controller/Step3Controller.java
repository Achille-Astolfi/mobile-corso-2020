package com.example.corso.mobile.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/step3")
public class Step3Controller {
	@GetMapping
	public String getPage() {
		return "step3";
	}
}
