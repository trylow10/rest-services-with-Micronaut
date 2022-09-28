package com.trilochan.micronaut;


import io.micronaut.data.annotation.Repository;

@Repository
public interface InternsRepositary extends
        CrudReposrsitary<Interns, Long> {
}
