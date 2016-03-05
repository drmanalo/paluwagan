package com.manalo.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class Miembro extends AbstractAuditEntity {

    @Id
    @GeneratedValue
    private Integer id;

    private String pangalan;
    private String apelyido;
    private String username;
    private String password;
}
