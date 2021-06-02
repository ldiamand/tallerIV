package ar.edu.ips.taller4.demo.services.impl;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import ar.edu.ips.taller4.demo.model.Usuario;
import ar.edu.ips.taller4.demo.repository.UsuarioRepository;

@Service
public class JwtUserDetailsService implements UserDetailsService {

	@Autowired
	private UsuarioRepository repo;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Optional<Usuario> optional = repo.findByUsername(username);
		if (optional.isPresent()) {
			Usuario user = optional.get();
			List<GrantedAuthority> roles = new ArrayList<>();
			roles.add(new SimpleGrantedAuthority("ADMIN"));
			return new User(user.getUsername(), user.getPassword(),
					roles);
		} else {
			throw new UsernameNotFoundException("User not found with username: " + username);
		}
	}

}