package ar.edu.ips.taller4.demo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ar.edu.ips.taller4.demo.model.Animal;
import ar.edu.ips.taller4.demo.model.Usuario;
import ar.edu.ips.taller4.demo.model.UsuarioFlaco;

/**
 * CRUD
 * 
 * @author user
 *
 */
@Repository
public interface AnimalRepository extends JpaRepository<Animal, Long> {
	
}
