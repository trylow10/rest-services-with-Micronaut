package com.trilochan.micronaut;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.UUID;

@Entity
public class Interns {
    @Id
    @GeneratedValue
    private UUID id;
    private String name;
    private String streams;
    private int age;

    public Interns(String name, String streams, int age) {
        this.name = name;
        this.streams = streams;
        this.age = age;
    }

    public Interns() {

    }

    public UUID getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStreams() {
        return streams;
    }

    public void setStreams(String streams) {
        this.streams = streams;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

