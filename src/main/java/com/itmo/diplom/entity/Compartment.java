package com.itmo.diplom.entity;

import javax.persistence.*;
import java.util.Set;

@Entity // This tells Hibernate to make a table out of this class
public class Compartment {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;

    private String name;

    public Set<Camera> getCameras() {
        return cameras;
    }

    public void setCameras(Set<Camera> cameras) {
        this.cameras = cameras;
    }

    @OneToMany(mappedBy = "compartment")
    private Set<Camera> cameras;

    public Set<Sensors> getSensors() {
        return sensors;
    }

    public void setSensors(Set<Sensors> sensors) {
        this.sensors = sensors;
    }

    @OneToMany(mappedBy = "compartment")
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
}