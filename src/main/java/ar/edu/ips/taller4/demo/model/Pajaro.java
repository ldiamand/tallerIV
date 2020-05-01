package ar.edu.ips.taller4.demo.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import lombok.Data;

@Entity
@DiscriminatorValue(value="B")
@Data
public class Pajaro extends Animal {

	private boolean vuela;

}
