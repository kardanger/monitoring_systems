package com.itmo.diplom.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.Set;

@Entity // This tells Hibernate to make a table out of this class
public class Decks {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;

    private String name;

    @OneToMany(mappedBy = "deck")
    @JsonBackReference
    private Set<Sensors> sensors;

    @Column(name="link_img")
    private String linkImg;

    @OneToMany(mappedBy = "deck")
    @JsonBackReference
    private Set<Camera> cameras;

    public Set<Camera> getCameras() {
        return cameras;
    }

    public void setCameras(Set<Camera> cameras) {
        this.cameras = cameras;
    }

    public Set<Sensors> getSensors() {
        return sensors;
    }

    public void setSensors(Set<Sensors> sensors) {
        this.sensors = sensors;
    }

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

    public String getLinkImg() {
        return linkImg;
    }

    public void setLinkImg(String linkImg) {
        this.linkImg = linkImg;
    }
}