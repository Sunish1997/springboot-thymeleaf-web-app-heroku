package net.javaguides.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloWorldController {

	@GetMapping("/dance")
	public String hello(Model model)
	{
		model.addAttribute("message", " Welcome to my page ");
		return "helloworld";
		
	}
	
}
