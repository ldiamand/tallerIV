package ar.edu.ips.taller4.demo.controllers;

import java.util.List;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import ar.edu.ips.taller4.demo.model.Animal;
import ar.edu.ips.taller4.demo.model.Pajaro;
import ar.edu.ips.taller4.demo.model.Perro;
import ar.edu.ips.taller4.demo.model.Usuario;
import ar.edu.ips.taller4.demo.model.UsuarioFlaco;
import ar.edu.ips.taller4.demo.repositories.AnimalRepository;
import ar.edu.ips.taller4.demo.services.UsuarioService;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping(path = "/animal")
@Slf4j
public class AnimalController {
	
	@Autowired
	private AnimalRepository repo;

	// curl -X POST -H 'Content-Type: application/json' 
	//   --data '{"id": 1,"nombre":"luciano","apellido":"diamand"}' 'http://localhost:8080/usuario'
	@PostMapping
	public Pajaro crearUsuario(@RequestBody Pajaro animal) {
		return repo.save(animal);
	}
	
}
