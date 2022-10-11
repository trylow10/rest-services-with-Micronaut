package com.trilochan.micronaut.shop.service;


import com.trilochan.micronaut.shop.dto.Studentdto;
import com.trilochan.micronaut.shop.entity.Student;

public interface StudentService {

    Studentdto createStudent(Studentdto studentdto);

    Studentdto studentByName(String name);
}
