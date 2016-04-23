package com.manalo.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.data.jpa.domain.AbstractAuditable;

@Entity
public class Serye extends AbstractAuditable<Miembro, Long> {

	private static final long serialVersionUID = 4859361343915371974L;

	@Temporal(TemporalType.DATE)
	private Date umpisa;

	@Temporal(TemporalType.DATE)
	private Date tapos;

	public Date getUmpisa() {
		return umpisa;
	}

	public void setUmpisa(Date umpisa) {
		this.umpisa = umpisa;
	}

	public Date getTapos() {
		return tapos;
	}

	public void setTapos(Date tapos) {
		this.tapos = tapos;
	}

}
