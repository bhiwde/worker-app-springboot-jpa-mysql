package com.program.worker.worker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/worker")
public class Workercontroller {
	
@GetMapping("/home")
public String home() {
	return "Welcome TO Worker App";
}
}
