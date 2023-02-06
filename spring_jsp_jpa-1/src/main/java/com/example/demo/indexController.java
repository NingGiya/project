package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

public class indexController {

	@GetMapping("/")
	public String index() {
		System.out.println("index@@Å×½ºÆ®");
		return "index";
	}

}
