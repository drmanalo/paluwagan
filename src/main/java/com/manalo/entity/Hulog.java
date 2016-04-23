package com.manalo.entity;

import java.util.Currency;

import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.springframework.data.jpa.domain.AbstractAuditable;

@Entity
public class Hulog extends AbstractAuditable<Miembro, Long> {

	private static final long serialVersionUID = -1941388419459690500L;

	@ManyToOne
	@JoinColumn(name = "miembro_id", insertable = false, updatable = false, foreignKey = @ForeignKey(name = "FK_hulog_miembro_id") )
	private Miembro miembro;

	private Currency magkano;

	public Miembro getMiembro() {
		return miembro;
	}

	public void setMiembro(Miembro miembro) {
		this.miembro = miembro;
	}

	public Currency getMagkano() {
		return magkano;
	}

	public void setMagkano(Currency magkano) {
		this.magkano = magkano;
	}

}
