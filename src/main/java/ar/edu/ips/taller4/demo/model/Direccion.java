package ar.edu.ips.taller4.demo.model;

import javax.persistence.Embeddable;

import lombok.Data;

@Embeddable
@Data
public class Direccion {

	private String calle;
	
	private String altura;
	
}
