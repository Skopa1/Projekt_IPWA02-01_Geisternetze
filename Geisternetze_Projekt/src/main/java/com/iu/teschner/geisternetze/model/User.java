package com.iu.teschner.geisternetze.model;


import jakarta.persistence.*;

import java.util.List;


@Entity
@Table(name = "Benutzer")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String username;
    private String password;
    private String schiffname;
    private String telnummer;

    @OneToMany(mappedBy = "user")
    private List<Netz> netze;

    public String getTelnummer() {
        return telnummer;
    }

    public void setTelnummer(String telnummer) {
        this.telnummer = telnummer;
    }

    public User() {
    }

    public User(String password, String username, String schiffname, String telnummer) {
        this.password = password;
        this.username = username;
        this.schiffname = schiffname;
        this.telnummer = telnummer;
    }

    public Long getId() {
        return id;
    }

    public String getSchiffname() {
        return schiffname;
    }

    public void setSchiffname(String schiffname) {
        this.schiffname = schiffname;
    }

    public void setId(Long id) {
        this.id = id;
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

    public List<Netz> getNetze() {
        return netze;
    }

    public void setNetze(List<Netz> netze) {
        this.netze = netze;
    }

}
