package com.manalo.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Currency;
import java.util.Date;

@Data
@Entity
public class Bangko {

    @Id
    @GeneratedValue
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "memberid")
    private Miembro miembro;

    @ManyToOne
    @JoinColumn(name = "seriesid")
    private Serye serye;

    private Currency magkano;
    private Date kailan;
    private String transaksyon;
}
