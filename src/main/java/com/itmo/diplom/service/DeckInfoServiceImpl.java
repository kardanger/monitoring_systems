package com.itmo.diplom.service;
import com.itmo.diplom.entity.Camera;
import com.itmo.diplom.entity.Sensors;
import com.itmo.diplom.entity.VideoEntity;
import com.itmo.diplom.repo.DecksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeckInfoServiceImpl implements  DeckInfoService{

    @Autowired
    DecksRepository repository;
    
    @Override
    public DeckInfo buildGetInfoByDeck(int idDeck) {
        return null;
    }

    @Override
    public List<Sensors> getSensorsByDeck(int idDeck) {
        return null;
    }

    @Override
    public List<Camera> getCamerasByDeck(int idDeck) {
        return null;
    }

    @Override
    public List<VideoEntity> getVideoEntityByDeck(int idDeck) {
        return null;
    }
}
