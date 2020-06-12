package com.rschn.location.repos;

import org.springframework.data.repository.CrudRepository;

import com.rschn.location.entities.Location;

public interface LocationRepository extends CrudRepository<Location, Integer> {

}
