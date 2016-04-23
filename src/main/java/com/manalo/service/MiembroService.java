package com.manalo.service;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.manalo.dto.MiembroDto;
import com.manalo.entity.Miembro;
import com.manalo.repository.MiembroRepository;

@Service
public class MiembroService {

	@Autowired
	private MiembroRepository miembroRepository;

	public Miembro findOne(Long id) {
		return miembroRepository.findOne(id);
	}

	public Collection<MiembroDto> findAll() {

		Collection<Miembro> miembros = miembroRepository.findAll();
		Collection<MiembroDto> miembroDtos = new ArrayList<>();

		for (Miembro miembro : miembros) {
			MiembroDto miembroDto = new MiembroDto();
			BeanUtils.copyProperties(miembro, miembroDto);
			miembroDtos.add(miembroDto);
		}
		return miembroDtos;
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
