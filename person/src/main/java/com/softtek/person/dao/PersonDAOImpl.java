package com.softtek.person.dao;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.softtek.person.dto.PersonDTO;
import com.softtek.person.model.Persons;
import com.softtek.person.repository.PersonnRepository;

@Repository
public class PersonDAOImpl implements PersonDAO{
	
	@Autowired
	DataSource dataSource;
	
	@Autowired
	PersonnRepository personRepository;
	
	@Transactional(readOnly = true)
	@Override
	public List<PersonDTO> executeGetPersons() {
		
		List<PersonDTO> listPersonOut = new ArrayList<>();
		
		for(Persons personDataBase : personRepository.findAll()) {
			PersonDTO personInMemory = new PersonDTO();
			personInMemory.setPerson_id(personDataBase.getPerson_id());
			personInMemory.setFirst_name(personDataBase.getFirst_name());
			personInMemory.setLast_name(personDataBase.getLast_name());
			personInMemory.setGender(personDataBase.getGender());
			personInMemory.setDni(personDataBase.getDni());
			personInMemory.setEmail(personDataBase.getEmail());
			personInMemory.setStatus(personDataBase.getStatus());
			
			listPersonOut.add(personInMemory);
			
		}
		return listPersonOut;
	}

	
	@Override
	public PersonDTO executeGetPerson(long id) {
		Persons personDataBase = personRepository.findById(id).get();
		
		PersonDTO personOut = new PersonDTO();
		
		personOut.setPerson_id(personDataBase.getPerson_id());
		personOut.setFirst_name(personDataBase.getFirst_name());
		personOut.setLast_name(personDataBase.getLast_name());
		personOut.setGender(personDataBase.getGender());
		personOut.setDni(personDataBase.getDni());
		personOut.setEmail(personDataBase.getEmail());
		personOut.setStatus(personDataBase.getStatus());
				
		return personOut;
	}


	@Override
	public PersonDTO executeSavePerson(PersonDTO newPerson) {
		
		Persons newPersonn = new Persons();
		
		newPersonn.setPerson_id(newPerson.getPerson_id());
		newPersonn.setFirst_name(newPerson.getFirst_name());
		newPersonn.setLast_name(newPerson.getLast_name());
		newPersonn.setGender(newPerson.getGender());
		newPersonn.setDni(newPerson.getDni());
		newPersonn.setEmail(newPerson.getEmail());
		newPersonn.setStatus(newPerson.getStatus());
		
		personRepository.save(newPersonn);
		
		
		return newPerson;
	}


	@Override
	public String executeDeletePerson(long id) {
		personRepository.deleteById(id);
		return "Deleted Person";
	}

}
