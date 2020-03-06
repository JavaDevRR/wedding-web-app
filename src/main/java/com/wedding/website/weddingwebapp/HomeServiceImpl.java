package com.wedding.website.weddingwebapp;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HomeServiceImpl implements HomeService {
	

	@Autowired
	HomeRepository homeRepository;
	
	@Override
	public Iterable<Home> list(){
		System.out.println(this.homeRepository.findAll());
		return this.homeRepository.findAll();
	}
	
	public void save() {
		
		ArrayList<Home> homelist = new ArrayList<Home>();
		
		Home h1 = new Home();
		h1.setMsg("HELP");
		homelist.add(h1);
		
		Home h2 = new Home();
		h2.setMsg("HELP");
		homelist.add(h2);
		
		this.homeRepository.saveAll(homelist);
		
	}

	public HomeServiceImpl(HomeRepository homeRepository) {
		super();
		this.homeRepository = homeRepository;
	}

	
	

}
