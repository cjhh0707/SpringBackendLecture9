package com.example.jpaexample.dto;

public record MenuResponse(
    Long id,
    String name,
    int price,
    String categoryName
) {

}
