package com.microservice.playground.sample.jpa.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class SampleRelatedEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "SAMPLE_RELATED_ENTITY_ID")
    private Long id;

    @OneToMany(cascade = CascadeType.ALL)
    private Set<SampleEntity> sampleEntities = new HashSet<>();

    public Set<SampleEntity> getSampleEntities() {
        return sampleEntities;
    }

    public void setSampleEntities(Set<SampleEntity> sampleEntities) {
        this.sampleEntities = sampleEntities;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
