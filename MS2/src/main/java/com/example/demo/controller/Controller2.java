package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.dao.DataInterface;
import com.example.demo.model.User;

@Controller
public class Controller2 {
	
	@Autowired
	DataInterface d;
	
	@RequestMapping("/second")
	public String home(@RequestBody User user)
	{
		
		System.out.println(user);
		d.save(user);
		return "hello";
	}
	

	
}
