package com.mario.reyes.demo.entidad;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface usuarioRepositorio extends JpaRepository<entidadUsuario, Long> {

	Optional<entidadUsuario> findById(Long id);

	List<entidadUsuario> findAll();

	entidadUsuario save(entidadUsuario usuario);

	void deleteById(Long id);

}
