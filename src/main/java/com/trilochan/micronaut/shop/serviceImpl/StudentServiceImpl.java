package com.trilochan.micronaut.shop.serviceImpl;


import com.trilochan.micronaut.shop.dto.Studentdto;
import com.trilochan.micronaut.shop.entity.Student;
import com.trilochan.micronaut.shop.mapper.StudentMapper;
import com.trilochan.micronaut.shop.repository.StudentRepository;
import com.trilochan.micronaut.shop.service.StudentService;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;

@Singleton
public class StudentServiceImpl implements StudentService {

    @Inject
    StudentRepository studentRepository;

    @Override
    public Studentdto studentByName(String name) {
        return studentRepository.findByName(name)
                .map(StudentMapper::toDto)
                .orElseThrow(RuntimeException::new);
    }

    @Override
    public Studentdto createStudent(Studentdto studentdto) {
        Student data = StudentMapper.toEntity(studentdto);
        return StudentMapper.toDto(studentRepository.save(data));
    }
}
