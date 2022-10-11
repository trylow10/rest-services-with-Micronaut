package com.trilochan.micronaut.shop.dto;

import lombok.Builder;

import java.util.UUID;

public record Studentdto(UUID id,
                         String name,
                         String phoneNumber,
                         String rollNumber,
                         String institution) {
    @Builder(toBuilder = true)
    public Studentdto{
    }

}
