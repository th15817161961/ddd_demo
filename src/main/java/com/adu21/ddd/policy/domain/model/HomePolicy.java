package com.adu21.ddd.policy.domain.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;

@Getter
@Setter
@Entity
public class HomePolicy extends Policy {
    private String buildingMaterial;
    private String buildingType;
    private String numberOfRooms;
}
