package ar.edu.ips.taller4.demo.controllers;

import org.springframework.data.jpa.repository.JpaRepository;

import ar.edu.ips.taller4.demo.model.Medico;

public interface MedicoRepository extends JpaRepository<Medico, Long>{

}
