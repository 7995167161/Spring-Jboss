package com.cts.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JbossController {

@RequestMapping("/hello")
	public String hello() {
		return "Hello Kailasam";
	}
}