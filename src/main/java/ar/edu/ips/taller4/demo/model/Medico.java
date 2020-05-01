package ar.edu.ips.taller4.demo.model;

import javax.persistence.Entity;

import lombok.Data;

@Entity
@Data
public class Medico extends Persona {

	private String matricula;
	
}
