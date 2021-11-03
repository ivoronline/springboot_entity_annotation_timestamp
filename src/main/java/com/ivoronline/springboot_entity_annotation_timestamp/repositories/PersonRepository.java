package com.ivoronline.springboot_entity_annotation_timestamp.repositories;

import com.ivoronline.springboot_entity_annotation_timestamp.entities.PersonEntity;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<PersonEntity, Integer> { }
