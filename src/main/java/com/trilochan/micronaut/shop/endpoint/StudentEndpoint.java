package com.trilochan.micronaut.shop.endpoint;

import com.trilochan.micronaut.shop.dto.Studentdto;

import com.trilochan.micronaut.shop.service.StudentService;
import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Post;
import jakarta.inject.Inject;

@Controller("students")
public class StudentEndpoint {

    @Inject
    StudentService studentService;

    @Post("/createStudent")
    public Studentdto createStudent(@Body Studentdto body ){
        var data = studentService.createStudent(body);
        return data;
}

    @Post("/byName")
    public Studentdto studentByName(@Body Studentdto body){
        return studentService.studentByName(body.name());
    }



}
