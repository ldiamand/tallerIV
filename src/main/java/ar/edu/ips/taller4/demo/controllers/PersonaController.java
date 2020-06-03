package ar.edu.ips.taller4.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ar.edu.ips.taller4.demo.model.Persona;

@RestController
@RequestMapping("/personas")
@CrossOrigin
public class PersonaController {

	@Autowired
	private PersonaRepository repo;
	
	@PostMapping
	public Persona save(@RequestBody Persona persona) {
		return repo.save(persona);
	}
	
	@GetMapping
	public List<Persona> getAll() {
		return repo.findAll();
	}
	
}
