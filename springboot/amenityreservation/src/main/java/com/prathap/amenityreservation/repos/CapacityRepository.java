package com.prathap.amenityreservation.repos;

import com.prathap.amenityreservation.model.AmenityType;
import com.prathap.amenityreservation.model.Capacity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CapacityRepository extends JpaRepository<Capacity, Long> {
    Capacity findByAmenityType(AmenityType amenityType);
}