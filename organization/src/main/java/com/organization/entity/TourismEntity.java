package com.organization.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "tourism_data")
public class TourismEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long tourismId;

    private String nameOfTourism;

    private String numberOfMembers;

    private String country;

    private String noOfPlaces;

    private int totalPrize;

}
