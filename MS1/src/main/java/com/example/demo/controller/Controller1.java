package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.HttpStatusCodeException;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.model.User;

@RestController
public class Controller1 {
	@Autowired
	private RestTemplate rest;
	
	@RequestMapping("/Index")
	public ModelAndView home()
	{
		ModelAndView  modelAndView = new ModelAndView(); 
		  modelAndView.setViewName("Index.html");
	      return modelAndView;
	}
	//User user=new User("dw","wefe","ee","r3");
	@RequestMapping("/Index/registration")
	public String signup(User user)
	{
		String temp="sa";
		System.out.println(temp);
		System.out.println(user);
		try {
		temp=rest.postForObject("http://localhost:8081/second", user, String.class);
		}
		catch (HttpStatusCodeException e) {
			// TODO: handle exception
			e.getMessage();
		}
		System.out.println(temp);
		return "Registration done";
		
	}
	

}
