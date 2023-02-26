package com.demo.mapstruct.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CarDTO {
    private String name;

    private String brandDTO;

    private Float priceDTO;

    private Integer yearOfProductionDTO;
}
