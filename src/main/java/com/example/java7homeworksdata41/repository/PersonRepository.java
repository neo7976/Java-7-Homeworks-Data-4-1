package com.example.java7homeworksdata41.repository;

import com.example.java7homeworksdata41.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.validation.constraints.Min;
import java.util.List;
import java.util.Optional;

public interface PersonRepository extends JpaRepository<Person, Long> {

    List<Person> findAllByCityOrderBySurname(String city);
    List<Person> findByAgeLessThanOrderByAge(@Min(0) int age);
    Optional<Person> findByNameAndSurname(String name, String surname);
}
