package com.microservice.playground.sample.jpa.entity;

import javax.persistence.*;

@Entity
public class SampleEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "SAMPLE_ENTITY_ID")
    private Long id;

    private String entityValue;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEntityValue() {
        return entityValue;
    }

    public void setEntityValue(String entityValue) {
        this.entityValue = entityValue;
    }
}
