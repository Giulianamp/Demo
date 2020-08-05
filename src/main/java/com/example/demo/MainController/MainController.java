package com.example.demo.MainController;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class MainController {
	
	//helloWorld
	
	@RequestMapping(method = RequestMethod.GET, path="hello-world")
	public String helloWorld() {
		return "Hello World";
	}

	@RequestMapping(method = RequestMethod.GET, path="hello-world-bean")
	public HelloWorldBean helloWorldBean() {
		return new HelloWorldBean("Hello World");
		
	}
	
	//PAGINA GALLINEROS
	
	@RequestMapping(method = RequestMethod.GET, path="/gallineros")
	public ModelAndView gallineroGet() {
		ModelAndView modelAndView = new ModelAndView();
		
		return modelAndView;
	}
	
	//PAGINA GALLINAS
}
