package com.demo.mapstruct.service.mapper;

import com.demo.mapstruct.dto.Car;
import com.demo.mapstruct.dto.CarDTO;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.mapstruct.factory.Mappers;

@Slf4j
public class TestCarMapper {

    private final CarMapper mapper = Mappers.getMapper(CarMapper.class);

    @Test
    @DisplayName("Test destination carDTO must be equal to source car")
    public void DestinationCarDTOMustBeEqualToSourceCar() {
        log.info("Test destination carDTO must be equal to source car");
        Car car = new Car();
        car.setName("My car");
        car.setBrand("Yamaha");
        car.setYearOfProduction(2016);

        CarDTO carDTO = mapper.toCarDTO(car);

        assertEquals(car.getName(), carDTO.getName());
        assertEquals(car.getBrand(), carDTO.getBrandDTO());
        assertEquals(car.getYearOfProduction(), carDTO.getYearOfProductionDTO());
        assertNull(car.getPrice());
    }
}
