package org.example.data;

import org.example.aop.Intercepted;
import org.example.domain.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long>
{
  @Intercepted
  Person findByName(String name);
}
