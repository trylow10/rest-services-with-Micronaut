package com.trilochan.micronaut;


import io.micronaut.data.annotation.Repository;

import java.util.UUID;

@Repository
public interface InternsRepositary extends
        CrudRepository<Interns, UUID> {
}
