package com.itmo.diplom.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.Set;

@Entity(name="cameras")
public class Camera {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;
    private String serial;
    private String status;
    private String name;

    @ManyToOne
    @JoinColumn(name="id_camera_type")
    @JsonManagedReference
    private CamerasType cameraType;

    @ManyToOne
    @JoinColumn(name="id_decks")
    @JsonManagedReference
    private Decks deck;

    @ManyToOne
    @JoinColumn(name="id_compartment")
    private Compartment compartment;

    @OneToMany(mappedBy = "camera")
    @JsonBackReference
    private Set<VideoEntity> videosEntity;

    public CamerasType getCameraType() {
        return cameraType;
    }

    public void setCameraType(CamerasType cameraType) {
        this.cameraType = cameraType;
    }

    public Set<VideoEntity> getVideosEntity() {
        return this.videosEntity;
    }

    public void setVideosEntity(Set<VideoEntity> contactTelDetails) {
        this.videosEntity = contactTelDetails;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public Integer getId() {
        return id;
    }

    public Decks getDeck() {
        return deck;
    }

    public void setDeck(Decks deck) {
        this.deck = deck;
    }

    public Compartment getCompartment() {
        return compartment;
    }

    public void setCompartment(Compartment compartment) {
        this.compartment = compartment;
    }
}