package com.haydikodlayalim.graphql.api;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.haydikodlayalim.graphql.dto.VehicleDto;
import com.haydikodlayalim.graphql.entity.Vehicle;
import com.haydikodlayalim.graphql.repo.VehicleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
@RequiredArgsConstructor
public class VehicleMutationResolver implements GraphQLMutationResolver {

    private final VehicleRepository vehicleRepository;

    public Vehicle createVehicle(VehicleDto vehicleDto) {
        return vehicleRepository.save(dtoToEntity(vehicleDto));
    }

    private Vehicle dtoToEntity(VehicleDto vehicleDto){
        Vehicle vehicle=new Vehicle();
        vehicle.setBrandName(vehicleDto.getBrandName());
        vehicle.setLaunchDate(new Date());
        vehicle.setModelCode(vehicleDto.getModelCode());
        vehicle.setType(vehicleDto.getType());
        return vehicle;
    }
}