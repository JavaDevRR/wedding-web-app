package com.wedding.website.weddingwebapp;

 import org.springframework.stereotype.Service;
@Service
public interface HomeService {

	Iterable<Home> list();

	void save();

}
