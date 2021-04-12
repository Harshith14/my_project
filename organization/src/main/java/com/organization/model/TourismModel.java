package com.organization.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TourismModel {

    @Id
    private Long tourismId;

    private String nameOfTourism;

    private String numberOfMembers;

    private String country;

    private String noOfPlaces;

    private int totalPrize;

}
