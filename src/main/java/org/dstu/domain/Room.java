package org.dstu.domain;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
public class Room {
    private int id;
    private int square;

    private Set<Sofa> sofas = new LinkedHashSet<>();

    @Basic
    @Id
    @GeneratedValue
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "square")
    public int getSquare() {
        return square;
    }

    public void setSquare(int square) {
        this.square = square;
    }

    public void setSofas(Set<Sofa> sofas) {
        this.sofas = sofas;
    }

    @OneToMany(mappedBy = "room")
    public Set<Sofa> getSofas() {
        return sofas;
    }

}
