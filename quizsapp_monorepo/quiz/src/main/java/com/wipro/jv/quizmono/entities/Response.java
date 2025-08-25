package com.wipro.jv.quizmono.entities;

//import lombok.AllArgsConstructor;
//
//import lombok.Data;
//
//import lombok.RequiredArgsConstructor;

//@Data
//@AllArgsConstructor
//@RequiredArgsConstructor
public class Response {

	private int id;

	private String response;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getResponse() {
		return response;
	}

	public void setResponse(String response) {
		this.response = response;
	}

	public Response() {
		super();
	}
	
	

}
