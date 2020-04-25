package ar.edu.ips.taller4.demo.model;

import javax.persistence.Embeddable;

import lombok.Data;

@Data
@Embeddable
public class Telefono {

	private Integer numero;
	
	private Integer codigo;
	
}
