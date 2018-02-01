package com.microservice.playground.sample.jpa.repository;

import com.microservice.playground.sample.jpa.entity.SampleEntity;
import org.springframework.data.repository.CrudRepository;

public interface SampleEntityRepository extends CrudRepository<SampleEntity, Long> {}