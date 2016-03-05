package com.manalo.service;

import com.manalo.datatransfer.MiembroForm;
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

    public void save(MiembroForm miembroForm) {

    }
}
