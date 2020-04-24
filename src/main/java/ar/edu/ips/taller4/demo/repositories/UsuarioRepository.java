package ar.edu.ips.taller4.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ar.edu.ips.taller4.demo.model.Usuario;

/**
 * CRUD
 * 
 * @author user
 *
 */
@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

}
