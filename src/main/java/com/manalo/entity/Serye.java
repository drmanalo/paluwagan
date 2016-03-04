package com.manalo.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Data
@Entity
public class Serye {

    @Id
    @GeneratedValue
    private Integer id;

    private Date umpisa;
    private Date tapos;
}
