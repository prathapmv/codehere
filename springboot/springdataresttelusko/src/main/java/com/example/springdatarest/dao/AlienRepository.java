package com.example.springdatarest.dao;

import com.example.springdatarest.model.AlienModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "aliens", path = "aliens")
public interface AlienRepository extends JpaRepository<AlienModel, Integer> {
}
