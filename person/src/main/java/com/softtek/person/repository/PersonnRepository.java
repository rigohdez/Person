package com.softtek.person.repository;

import org.springframework.data.repository.CrudRepository;

import com.softtek.person.model.Persons;

public interface PersonnRepository extends CrudRepository<Persons,Long>{

}
