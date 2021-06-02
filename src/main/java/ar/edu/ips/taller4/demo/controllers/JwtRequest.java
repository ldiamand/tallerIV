package ar.edu.ips.taller4.demo.controllers;

import lombok.Data;

@Data
public class JwtRequest {

	private String username;
	
	private String password;
}
