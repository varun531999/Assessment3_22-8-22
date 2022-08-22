package com.example.demo.controller;

import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CustomerDetails {
	@RequestMapping("/getdata")
	public String getdata(@RequestParam("c_id") int cid,@RequestParam("c_name") String c_name,@RequestParam("c_phone") String cnumb,@RequestParam("c_add") String add,@RequestParam("c_logig") String log,
			@RequestParam("c_pass") String pass,Model M){
		
		M.addAttribute("c_name", c_name);
		M.addAttribute("c_id", cid);
		M.addAttribute("c_phone", cnumb);
		M.addAttribute("c_add", add);
		M.addAttribute("c_logig", log);
		M.addAttribute("c_pass", pass);
		return "final";
	}
}
