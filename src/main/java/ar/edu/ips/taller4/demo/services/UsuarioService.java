package ar.edu.ips.taller4.demo.services;

import java.util.List;
import java.util.Optional;

import ar.edu.ips.taller4.demo.model.Usuario;

public interface UsuarioService {

	List<Usuario> getAll();

	Optional<Usuario> findById(Long id);

	Usuario insert(Usuario usuario);

}
