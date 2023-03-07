package com.softtek.person.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.softtek.person.dao.PersonDAO;
import com.softtek.person.dto.PersonDTO;

@Service
public class PersonServiceImpl implements PersonService{
	
	@Autowired
	PersonDAO personDAO;

	@Override
	public List<PersonDTO> executeGetPersons() {
		// TODO Auto-generated method stub
		return personDAO.executeGetPersons();
	}

	@Override
	public PersonDTO executeGetPerson(long id) {
		// TODO Auto-generated method stub
		return personDAO.executeGetPerson(id);
	}

	@Override
	public PersonDTO executeSavePerson(PersonDTO newPerson) {
		// TODO Auto-generated method stub
		return personDAO.executeSavePerson(newPerson);
	}

	@Override
	public String executeDeletePerson(long id) {
		// TODO Auto-generated method stub
		return personDAO.executeDeletePerson(id);
	}

}
