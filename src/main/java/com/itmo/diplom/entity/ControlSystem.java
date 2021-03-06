package com.itmo.diplom.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.Set;

@Entity(name="control_systems")
public class ControlSystem {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;

    private String name;

    @OneToMany(mappedBy = "controlSystem")
    @JsonBackReference
    private Set<Sensors> sensors;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Sensors> getSensors() {
        return sensors;
    }

    public void setSensors(Set<Sensors> sensors) {
        this.sensors = sensors;
    }
}