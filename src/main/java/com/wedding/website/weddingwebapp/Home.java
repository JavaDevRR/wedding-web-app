package com.wedding.website.weddingwebapp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Data
@AllArgsConstructor
public class Home {
	
	@Id
	@GeneratedValue
	private long id;
	
	@Column
	private String msg;

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Home(long id, String msg) {
		super();
		this.id = id;
		this.msg = msg;
	}

	public Home() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
