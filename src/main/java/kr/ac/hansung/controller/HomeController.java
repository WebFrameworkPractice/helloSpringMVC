package kr.ac.hansung.controller;

import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller	// @Component + 컴트롤러 역할
public class HomeController {
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	//	http://localhost:8080/helloSpringMVC/
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String showHome() {
		
		return "home";	// view's logical name
	}
	
}
