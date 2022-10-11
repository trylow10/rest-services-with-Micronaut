package com.trilochan.micronaut.shop.repository;

import com.trilochan.micronaut.shop.entity.Student;
import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface StudentRepository extends CrudRepository<Student, UUID> {
    Optional<Student> findByName(String name);
}
