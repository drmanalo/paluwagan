package com.manalo.entity;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

import org.springframework.data.jpa.domain.AbstractAuditable;

@Entity
public class Miembro extends AbstractAuditable<Miembro, Long> {

	private static final long serialVersionUID = -6249068034408891125L;

	private String pangalan;

	private String apelyido;

	private String username;

	private String password;

	@OneToMany(mappedBy = "miembro")
	private Set<Hulog> hulog;

	public String getPangalan() {
		return pangalan;
	}

	public void setPangalan(String pangalan) {
		this.pangalan = pangalan;
	}

	public String getApelyido() {
		return apelyido;
	}

	public void setApelyido(String apelyido) {
		this.apelyido = apelyido;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Set<Hulog> getHulog() {
		return hulog;
	}

	public void setHulog(Set<Hulog> hulog) {
		this.hulog = hulog;
	}

}
