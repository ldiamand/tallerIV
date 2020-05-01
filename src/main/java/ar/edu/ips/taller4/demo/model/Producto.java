package ar.edu.ips.taller4.demo.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.MappedSuperclass;

import lombok.Data;

@MappedSuperclass
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Data
public abstract class Producto {

	@Id
	private String uuid;
	
	//@GeneratedValue(strategy = GenerationType.AUTO)
	//private Long id;
	
	private String nombre;

}
