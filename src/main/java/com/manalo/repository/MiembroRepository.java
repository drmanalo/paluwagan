package com.manalo.repository;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.manalo.entity.Miembro;

@Repository
public interface MiembroRepository extends JpaRepository<Miembro, Long> {

	Miembro findByUsername(String username);

	Collection<Miembro> findByApelyidoStartingWith(String apelyido);
}
