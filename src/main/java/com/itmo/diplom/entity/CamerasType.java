package com.itmo.diplom.entity;

import javax.persistence.*;
import java.util.Set;

@Entity(name="cameras_type") // This tells Hibernate to make a table out of this class
public class CamerasType {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;

    private String name;

    @OneToMany(mappedBy = "cameraType")
    private Set<Camera> cameras;

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