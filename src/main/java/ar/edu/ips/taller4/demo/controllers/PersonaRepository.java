package ar.edu.ips.taller4.demo.controllers;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ar.edu.ips.taller4.demo.model.Persona;

@Repository
public interface PersonaRepository extends JpaRepository<Persona, Long> {

}
