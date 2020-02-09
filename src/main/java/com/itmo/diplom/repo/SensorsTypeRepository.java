package com.itmo.diplom.repo;

import org.springframework.data.repository.CrudRepository;

import com.itmo.diplom.entity.SensorsType;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete



public interface SensorsTypeRepository extends CrudRepository<SensorsType, Integer> {

}