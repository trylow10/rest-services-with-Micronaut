package com.trilochan.micronaut.shop.mapper;

import com.trilochan.micronaut.shop.dto.Studentdto;
import com.trilochan.micronaut.shop.entity.Student;
import lombok.Builder;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Builder(toBuilder = true)
public class StudentMapper {

    public StudentMapper() {}

    public static Student toEntity(Studentdto studentdto){
        return Student.builder()
                .id(Optional.ofNullable(studentdto.id()).orElse(UUID.randomUUID()))
                .name(studentdto.name())
                .phoneNumber(studentdto.phoneNumber())
                .rollNumber(studentdto.rollNumber())
                .institution(studentdto.institution())
                .build();
    }

    public static Studentdto toDto(Student student){
        return Studentdto.builder()
                .id(student.getId())
                .name(student.getName())
                .phoneNumber(student.getPhoneNumber())
                .rollNumber(student.getRollNumber())
                .institution(student.getInstitution())
                .build();
    }

   public  static List<Studentdto> toDtoList(Iterable<Student> students){
        List<Studentdto> dtoList = new ArrayList<>();
        students.forEach(entity -> dtoList.add(toDto(entity)));
        return dtoList;
   }
}
