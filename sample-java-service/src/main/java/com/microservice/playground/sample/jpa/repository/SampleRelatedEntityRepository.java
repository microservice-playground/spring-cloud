package com.microservice.playground.sample.jpa.repository;

import com.microservice.playground.sample.jpa.entity.SampleRelatedEntity;
import org.springframework.data.repository.CrudRepository;

public interface SampleRelatedEntityRepository extends CrudRepository<SampleRelatedEntity, Long> {}