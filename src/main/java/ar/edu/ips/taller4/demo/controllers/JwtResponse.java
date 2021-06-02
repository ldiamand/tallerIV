package ar.edu.ips.taller4.demo.controllers;

import lombok.Data;

@Data
public class JwtResponse {

	private String token;
	
	public JwtResponse(String token) {
		this.token = token;
	}
}
