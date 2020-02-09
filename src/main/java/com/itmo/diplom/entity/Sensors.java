package com.itmo.diplom.entity;

import javax.persistence.*;

@Entity // This tells Hibernate to make a table out of this class
public class Sensors {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;

    private String serial;

    private String status;

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

    private String name;

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

    public SensorsType getSensorsType() {
        return sensorsType;
    }

    public void setSensorsType(SensorsType sensorsType) {
        this.sensorsType = sensorsType;
    }

    @ManyToOne
    @JoinColumn(name="id_sensors_type")
    private SensorsType sensorsType;

    public ControlSystem getControlSystem() {
        return controlSystem;
    }

    public void setControlSystem(ControlSystem controlSystem) {
        this.controlSystem = controlSystem;
    }

    @ManyToOne
    @JoinColumn(name="id_control_system")
    private ControlSystem controlSystem;

}