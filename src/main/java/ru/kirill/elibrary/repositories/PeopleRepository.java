package ru.kirill.elibrary.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.kirill.elibrary.model.Book;
import ru.kirill.elibrary.model.Person;

@Repository
public interface PeopleRepository extends JpaRepository<Person, Integer> {

}
