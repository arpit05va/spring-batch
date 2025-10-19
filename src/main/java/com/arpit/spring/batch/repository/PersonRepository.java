package com.arpit.spring.batch.repository;

import com.arpit.spring.batch.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person,Long> {
}
