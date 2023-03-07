package com.softtek.person.dao;

import java.util.List;

import com.softtek.person.dto.PersonDTO;

public interface PersonDAO {
	
	List<PersonDTO> executeGetPersons();
	
	PersonDTO executeGetPerson(long id);
	
	PersonDTO executeSavePerson(PersonDTO newPerson);
	
	String executeDeletePerson(long id);

}
