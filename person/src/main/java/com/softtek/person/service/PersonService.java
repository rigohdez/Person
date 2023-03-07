package com.softtek.person.service;

import java.util.List;

import com.softtek.person.dto.PersonDTO;

public interface PersonService {
	
	List<PersonDTO> executeGetPersons();
	
	PersonDTO executeGetPerson(long id);
	
	PersonDTO executeSavePerson(PersonDTO newPerson);
	
	String executeDeletePerson(long id);
	
}
