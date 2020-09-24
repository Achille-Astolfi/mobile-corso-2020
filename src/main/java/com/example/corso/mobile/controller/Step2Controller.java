package com.example.corso.mobile.controller;

import org.springframework.mobile.device.site.SitePreference;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/step2")
public class Step2Controller {
	@GetMapping
	public String getPage(SitePreference currentSitePreference) {
		if (currentSitePreference.isMobile()) {
			return "step2";
		} else {
			return "step1";
		}
	}
}
