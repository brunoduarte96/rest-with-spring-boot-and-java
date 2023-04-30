package br.com.duarte.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.duarte.model.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {

}
