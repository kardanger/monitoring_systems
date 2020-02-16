package com.itmo.diplom.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;

@Entity(name="videoarchive")
public class VideoEntity {

    public VideoEntity() {
    }

    public VideoEntity(Camera camera) {
        this.camera = camera;
    }
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;

    @ManyToOne
    @JoinColumn(name="id_camera")
    @JsonManagedReference
    private Camera camera;

    public Camera getCamera() {
        return this.camera;
    }

    private String duration;

    @Column(name = "begin_time")
    private String beginTime;

    private String uri;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(String beginTime) {
        this.beginTime = beginTime;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public void setCamera(Camera camera) {
        this.camera = camera;
    }
}