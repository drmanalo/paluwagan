package com.manalo.repository;

import com.manalo.entity.Miembro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface MiembroRepository extends JpaRepository<Miembro, Integer>{

    Miembro findByUsername(String username);

    Collection<Miembro> findByApelyidoStartingWith(String apelyido);
}
