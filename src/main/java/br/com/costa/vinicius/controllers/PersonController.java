package br.com.costa.vinicius.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.costa.vinicius.models.Person;
import br.com.costa.vinicius.services.PersonService;;

@RestController
@RequestMapping("/person")
public class PersonController {

   @Autowired
   private PersonService personService;

   @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
   public List<Person> findAll() {
      return this.personService.findAll();
   }
}
