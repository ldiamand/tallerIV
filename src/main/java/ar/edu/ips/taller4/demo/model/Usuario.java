package ar.edu.ips.taller4.demo.model;

import java.util.Set;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
// JPA
// ORM
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import lombok.Data;

@Data
@Entity
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;
	
	private String nombre;
	
	private String apellido;
	
	private Integer edad;
	
	@Embedded
	@AttributeOverrides({
		 @AttributeOverride(name="numero",column=@Column(name = "numero_casa")),
		 @AttributeOverride(name="codigo",column=@Column(name = "codigo_casa"))
   })
	private Telefono telefonoCasa;
	
	@Embedded
	@AttributeOverrides({
		 @AttributeOverride(name="numero",column=@Column(name = "numero_trabajo")),
		 @AttributeOverride(name="codigo",column=@Column(name = "codigo_trabajo"))
   })
	private Telefono telefonoTrabajo;
	
	@Embedded
	@AttributeOverrides({
		 @AttributeOverride(name="calle",column=@Column(name = "calle_domicilio")),
		 @AttributeOverride(name="altura",column=@Column(name = "altura_domicilio"))
   })
	private Direccion direccionCasa;
	
	@Embedded
	@AttributeOverrides({
		 @AttributeOverride(name="calle",column=@Column(name = "calle_trabajo")),
		 @AttributeOverride(name="altura",column=@Column(name = "altura_trabajo"))
    })
	private Direccion direccionTrabajo;
	
	@ManyToMany
	private Set<Item> items;
	
}
