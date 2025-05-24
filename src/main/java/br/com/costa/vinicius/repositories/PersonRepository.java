package br.com.costa.vinicius.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.costa.vinicius.models.Person;

public interface PersonRepository extends JpaRepository<Person, Long> {
   
}
