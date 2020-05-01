package ar.edu.ips.taller4.demo.services.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.edu.ips.taller4.demo.model.Usuario;
import ar.edu.ips.taller4.demo.model.UsuarioFlaco;
import ar.edu.ips.taller4.demo.repositories.UsuarioRepository;
import ar.edu.ips.taller4.demo.services.UsuarioService;

@Service
@Transactional
public class UsuarioServiceImpl implements UsuarioService {

	@Autowired
	private UsuarioRepository repository;
	
	@Override
	public List<Usuario> getAll() {		
		return repository.findAll();
	}

	@Override
	public Optional<Usuario> findById(Long id) {
		return repository.findById(id);
	}

	@Override
	public Usuario insert(Usuario usuario) {
		return repository.save(usuario);
	}

	@Override
	public Usuario update(Usuario usuario) {
		return repository.save(usuario);
	}

	@Override
	public List<UsuarioFlaco> findByNombreLike(String valor) {
		return repository.findByNombreStartingWith(valor);
	}

}
