package com.itmo.diplom.repo;

import org.springframework.data.repository.CrudRepository;

import com.itmo.diplom.entity.Compartment;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete



public interface CompartmentRepository extends CrudRepository<Compartment, Integer> {

}