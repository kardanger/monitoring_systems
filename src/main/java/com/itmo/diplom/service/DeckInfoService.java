package com.itmo.diplom.service;

import com.itmo.diplom.entity.Sensors;
import com.itmo.diplom.entity.Camera;
import com.itmo.diplom.entity.VideoEntity;

import java.util.List;

public interface DeckInfoService {

    List<Sensors> getSensorsByDeck(int idDeck);

    List<Camera> getCamerasByDeck(int idDeck);

    List<VideoEntity> getVideoEntityByDeck(int idDeck);

}
