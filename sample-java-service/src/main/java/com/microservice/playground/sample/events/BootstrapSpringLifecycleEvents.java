package com.microservice.playground.sample.events;

import com.microservice.playground.sample.jpa.entity.SampleEntity;
import com.microservice.playground.sample.jpa.entity.SampleRelatedEntity;
import com.microservice.playground.sample.jpa.repository.SampleEntityRepository;
import com.microservice.playground.sample.jpa.repository.SampleRelatedEntityRepository;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Set;

@Component
public class BootstrapSpringLifecycleEvents implements ApplicationListener<ContextRefreshedEvent> {

    private SampleEntityRepository sampleEntityRepository;
    private SampleRelatedEntityRepository sampleRelatedEntityRepository;

    public BootstrapSpringLifecycleEvents(SampleEntityRepository sampleEntityRepository, SampleRelatedEntityRepository sampleRelatedEntityRepository) {
        this.sampleEntityRepository = sampleEntityRepository;
        this.sampleRelatedEntityRepository = sampleRelatedEntityRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        initializeJpaData();
    }

    private void initializeJpaData() {
        SampleEntity sampleEntity = new SampleEntity();
        sampleEntity.setEntityValue("Some_Entity_Value");

        this.sampleEntityRepository.save(sampleEntity);

        SampleRelatedEntity sampleRelatedEntity = new SampleRelatedEntity();
        Set<SampleEntity> sampleEntitySet = new HashSet<>();
        sampleEntitySet.add(sampleEntity);
        sampleRelatedEntity.setSampleEntities(sampleEntitySet);

        this.sampleRelatedEntityRepository.save(sampleRelatedEntity);
    }
}
