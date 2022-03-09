package com.te.exm.controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.te.exm.model.Players;
import com.te.exm.service.MyService;

@Controller
public class MyControler {
	
	@Autowired
	MyService service;
	
	@GetMapping("/add")
	public String  add() {
		return "addPlayer";
	}
	
	@PostMapping("/added")
	public String  added(Players players) {
		boolean add = service.add(players);
		if(add) {
			return "success";
		}
		else {
			return "failure";
		}
	}
	
	@GetMapping("/equal")
	public String  validate() {
		return "login";
	}
	
	@PostMapping("/equal")
	public String equal() {
		return "verify";
	}
	
	

}
