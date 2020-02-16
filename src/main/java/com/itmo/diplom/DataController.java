package com.itmo.diplom;

import com.itmo.diplom.entity.Camera;
import com.itmo.diplom.entity.Decks;
import com.itmo.diplom.entity.Sensors;
import com.itmo.diplom.entity.VideoEntity;
import com.itmo.diplom.repo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path="/data")
public class DataController {

    @Autowired
    private DecksRepository decksRepository;

    @Autowired
    private SensorsTypeRepository sensorsTypeRepository;

    @Autowired
    private VideoEntityRepository videoEntityRepository;

    @Autowired
    private SensorsRepository sensorsRepository;

    @Autowired
    private CameraRepository cameraRepository;

    //TODO реализовать REST интерфейс

    @GetMapping(path="/allCameras")
    public @ResponseBody Iterable<Camera> getAllCameras() {
        return cameraRepository.findAll();
    }

    @GetMapping(path="/allSensors")
    public @ResponseBody Iterable<Sensors> getAllSensors() {
        return sensorsRepository.findAll();
    }

    @GetMapping(path="/allDecks")
    public @ResponseBody Iterable<Decks> getAllDecks() {
        return decksRepository.findAll();
    }

    @GetMapping(path="/allVideo")
    public @ResponseBody Iterable<VideoEntity> getAllVideo() {
        return videoEntityRepository.findAll();
    }
}

