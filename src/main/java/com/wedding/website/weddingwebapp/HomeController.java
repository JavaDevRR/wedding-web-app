package com.wedding.website.weddingwebapp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping("api/task")
public class HomeController {

	@Autowired
	HomeService homeService;
	
	/*
	 * @GetMapping(path="/home") public Iterable<Home> getHomePage() { Home h1 = new
	 * Home(); h1.setMsg("test"); System.out.println(homeService.list().toString());
	 * return homeService.list(); }
	 */
	
	
	@GetMapping(path="/save")
	public Home getSavePage() {
		Home h1 = new Home();
		h1.setMsg("test");
		
		return h1;
	}
	
	@PostMapping(produces = "application/json", consumes ="applicaiton/json")
	public Home putMsg() {
		return null;
		
	}


	/*
	 * public HomeController(HomeService homeService) { super(); this.homeService =
	 * homeService; }
	 */

}
