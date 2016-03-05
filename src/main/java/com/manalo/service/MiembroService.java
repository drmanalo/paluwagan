package com.manalo.service;

import com.manalo.entity.Miembro;
import com.manalo.repository.MiembroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Collection;

@Service
public class MiembroService {

    @Autowired
    private MiembroRepository miembroRepository;

    @PersistenceContext
    private EntityManager entityManager;

    public Collection<Miembro> findAll() {
        return miembroRepository.findAll();
    }

    public Collection<Miembro> findByApelyidoStartingWith(String apelyido) {
        return miembroRepository.findByApelyidoStartingWith(apelyido);
    }

    public Miembro save(Miembro miembro) {

        if (miembro.getId() != null) { // update
            Miembro existing = miembroRepository.findOne(miembro.getId());
            existing.setUsername(miembro.getUsername());
            existing.setPangalan(miembro.getPangalan());
            existing.setApelyido(miembro.getApelyido());
            return miembroRepository.save(existing);
        } else { // create
            return miembroRepository.save(miembro);
        }
    }
}
