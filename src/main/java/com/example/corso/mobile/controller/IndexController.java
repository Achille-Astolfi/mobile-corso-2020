package com.example.corso.mobile.controller;

import org.springframework.mobile.device.Device;
import org.springframework.mobile.device.site.SitePreference;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping({ "/index", "/" })
public class IndexController {
	@GetMapping
	public String getPage(Device device, SitePreference sitePreference, Model model) {
		return "index";
	}
}
