package com.demo.mapstruct.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Car {
    private String name;

    private String brand;

    private Float price;

    private Integer yearOfProduction;
}
