package com.ivoronline.springboot_entity_annotation_timestamp.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PersonEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)  //Applicable only for @Id Property
  public Integer id;
  public String  name;
  public Integer age;

}
