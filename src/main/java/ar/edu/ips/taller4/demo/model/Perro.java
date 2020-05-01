package ar.edu.ips.taller4.demo.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import lombok.Data;

@Entity
@DiscriminatorValue(value = "D")
@Data
public class Perro extends Animal {

	private int pulgas;

}
