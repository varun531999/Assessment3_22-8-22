package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Control {
	@RequestMapping("/")
	public String geth()
	{
		return "welcome";
	}
	@RequestMapping("/form1")
	public String form1()
	{
		
		return "insert";
		
	}
}
