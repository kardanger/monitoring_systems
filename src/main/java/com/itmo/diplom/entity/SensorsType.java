package com.itmo.diplom.entity;

import javax.persistence.*;
import java.util.Set;

@Entity(name="sensors_type")
public class SensorsType {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;

    private String name;

    public Set<Sensors> getSensors() {
        return sensors;
    }

    public void setSensors(Set<Sensors> sensors) {
        this.sensors = sensors;
    }

    @OneToMany(mappedBy = "sensorsType")
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