package com.softtek.person.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.softtek.person.dto.PersonDTO;
import com.softtek.person.service.PersonService;

@RestController
@RequestMapping("/api/")
public class PersonController {
	
	@Autowired
	PersonService personService;
	
	@GetMapping("/executeListPersons")
	public ResponseEntity<List<PersonDTO>> executeListPersons(){
		return new ResponseEntity<>(personService.executeGetPersons(),HttpStatus.OK);
	}
	
	@GetMapping("/executeListPerson/{id}")
	public PersonDTO executeListPerson(@PathVariable long id) {
		return personService.executeGetPerson(id);
	}
	
	@PostMapping("/executeSavePerson")
	public PersonDTO executeSavePerson(@RequestBody PersonDTO newPerson) {
		return personService.executeSavePerson(newPerson);
	}
	
	@DeleteMapping("/executeDeletePerson/{id}")
	public String executeDeletePerson(@PathVariable long id) {
		personService.executeDeletePerson(id);
		return "Deleted Person";
	}

}
