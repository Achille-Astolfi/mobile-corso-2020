package com.example.corso.mobile.config.front;

import java.util.Locale;

import org.springframework.web.servlet.view.JstlView;

public class CheckingJstlView extends JstlView {

	@Override
	public boolean checkResource(Locale locale) throws Exception {
		return getServletContext().getResource(getUrl()) != null;
	}

}
