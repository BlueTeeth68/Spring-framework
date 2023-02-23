package com.demo.mapstruct.service.mapper;

import com.demo.mapstruct.dto.Car;
import com.demo.mapstruct.dto.CarDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CarMapper {

    Car toCar(CarDTO car);

    @Mapping(target = "brandDTO", source = "brand")
    @Mapping(target = "priceDTO", source = "price")
    @Mapping(target = "yearOfProductionDTO", source = "yearOfProduction")
    CarDTO toCarDTO(Car car);

}
