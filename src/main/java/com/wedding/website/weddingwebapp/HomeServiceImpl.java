package com.wedding.website.weddingwebapp;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HomeServiceImpl implements HomeService {
	

	
	
	public void save() {
		
		ArrayList<Home> homelist = new ArrayList<Home>();
		
		Home h1 = new Home();
		h1.setMsg("HELP");
		homelist.add(h1);
		
		Home h2 = new Home();
		h2.setMsg("HELP");
		homelist.add(h2);
		
		
		
	}

	@Override
	public Iterable<Home> list() {
		// TODO Auto-generated method stub
		return null;
	}

	

	
	

}
