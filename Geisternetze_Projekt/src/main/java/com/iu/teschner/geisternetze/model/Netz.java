package com.iu.teschner.geisternetze.model;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class Netz {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String koordinaten;
    private String status;
    private String schiffname;
    private String groesse;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}


