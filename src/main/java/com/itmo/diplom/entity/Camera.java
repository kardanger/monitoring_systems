package com.itmo.diplom.entity;

import javax.persistence.*;
import java.util.Set;

@Entity(name="cameras")
public class Camera {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;

    private String serial;
    private String status;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    public Integer getId() {
        return id;
    }

    public Decks getDeck() {
        return deck;
    }

    public void setDeck(Decks deck) {
        this.deck = deck;
    }

    @ManyToOne
    @JoinColumn(name="id_decks")
    private Decks deck;

    public Compartment getCompartment() {
        return compartment;
    }

    public void setCompartment(Compartment compartment) {
        this.compartment = compartment;
    }

    @ManyToOne
    @JoinColumn(name="id_compartment")
    private Compartment compartment;

    @OneToMany(mappedBy = "camera")
    private Set<VideoEntity> videosEntity;

    public CamerasType getCameraType() {
        return cameraType;
    }

    public void setCameraType(CamerasType cameraType) {
        this.cameraType = cameraType;
    }

    @ManyToOne
    @JoinColumn(name="id_camera_type")
    private CamerasType cameraType;

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

}