package com.itmo.diplom.repo;

import org.springframework.data.repository.CrudRepository;

import com.itmo.diplom.entity.Decks;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete



public interface DecksRepository extends CrudRepository<Decks, Integer> {

}