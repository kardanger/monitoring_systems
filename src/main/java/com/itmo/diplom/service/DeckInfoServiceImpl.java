package com.itmo.diplom.service;
import com.itmo.diplom.entity.Camera;
import com.itmo.diplom.entity.Decks;
import com.itmo.diplom.entity.Sensors;
import com.itmo.diplom.entity.VideoEntity;
import com.itmo.diplom.repo.DecksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class DeckInfoServiceImpl implements  DeckInfoService{

    @Autowired
    DecksRepository repository;

    @Override
    public List<Sensors> getSensorsByDeck(int idDeck) {
        Optional<Decks> deck = repository.findById(idDeck);

        if(deck.isPresent()){
            List<Sensors> listEntities = new ArrayList<>(deck.get().getSensors());
            listEntities.sort(new Comparator<Sensors>() {
                @Override
                public int compare(Sensors o1, Sensors o2) {
                    return o1.getId() - o2.getId();
                }
            });
            return listEntities;
        }
        else{
            return null;
        }
    }

    @Override
    public List<Camera> getCamerasByDeck(int idDeck) {
        Optional<Decks> deck = repository.findById(idDeck);

        if(deck.isPresent()){
            List<Camera> listEntities = new ArrayList<>(deck.get().getCameras());
            listEntities.sort(new Comparator<Camera>() {
                @Override
                public int compare(Camera o1, Camera o2) {
                    return o1.getId() - o2.getId();
                }
            });
           return listEntities;
        }
        else{
            return null;
        }
    }

    @Override
    public List<VideoEntity> getVideoEntityByDeck(int idDeck) {
        Optional<Decks> deck = repository.findById(idDeck);

        if(deck.isPresent()){
            Set<Camera> cameras = deck.get().getCameras();
            List<VideoEntity> videoEntities = new ArrayList<>();
            for (Camera camera : cameras){
                Set<VideoEntity> videoEntitySet =  camera.getVideosEntity();
                videoEntities.addAll(new ArrayList<VideoEntity>(videoEntitySet));
            }
            videoEntities.sort(new Comparator<VideoEntity>() {
                @Override
                public int compare(VideoEntity o1, VideoEntity o2) {
                    return o1.getId() - o2.getId();
                }
            });
            return  videoEntities;
        }
        else{
            return null;
        }
    }
}
