package com.itmo.diplom.repo;

import org.springframework.data.repository.CrudRepository;

import com.itmo.diplom.entity.VideoEntity;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete



public interface VideoEntityRepository extends CrudRepository<VideoEntity, Integer> {

}