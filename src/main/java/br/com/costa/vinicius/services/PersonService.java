package br.com.costa.vinicius.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.costa.vinicius.repositories.PersonRepository;
import br.com.costa.vinicius.models.Person;

@Service
public class PersonService {
   @Autowired
   PersonRepository repository;

   public List<Person> findAll() {
      return repository.findAll();
   }
}
