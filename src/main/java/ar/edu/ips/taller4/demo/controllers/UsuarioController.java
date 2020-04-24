package ar.edu.ips.taller4.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ar.edu.ips.taller4.demo.model.Usuario;
import ar.edu.ips.taller4.demo.services.UsuarioService;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping(path = "/usuario")
@Slf4j
public class UsuarioController {

	@Autowired
	private UsuarioService service;

	@GetMapping("/{id}")
	public Usuario metodoGet(@PathVariable(name = "id") Long id) {
		log.info("Ingresando a metodoGet con id {}", id);
		return service.findById(id).orElseThrow(() -> { throw new RuntimeException("Usuario no existe"); });
	}
	
	@GetMapping
	public List<Usuario> getAll() {
		return service.getAll();
	}
	
	// curl -X POST -H 'Content-Type: application/json' 
	//   --data '{"id": 1,"nombre":"luciano","apellido":"diamand"}' 'http://localhost:8080/usuario'
	@PostMapping
	public Usuario crearUsuario(@RequestBody Usuario usuario) {
		return service.insert(usuario);
	}
	
}
