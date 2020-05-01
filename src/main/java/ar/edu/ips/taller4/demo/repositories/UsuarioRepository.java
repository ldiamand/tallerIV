package ar.edu.ips.taller4.demo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ar.edu.ips.taller4.demo.model.Usuario;
import ar.edu.ips.taller4.demo.model.UsuarioFlaco;

/**
 * CRUD
 * 
 * @author user
 *
 */
@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

	List<UsuarioFlaco> findByNombreStartingWith(String valor);
	
	List<UsuarioFlaco> findByItemNombre(String valor);
	
	List<Usuario> findByNombreIgnoreCase(String valor);
	
	List<Usuario> findByNombreStartingWithOrderByEdad(String valor);
	
	List<Usuario> findByNombreAndEdad(String nombre, Integer edad);
	
	
}
