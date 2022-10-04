package com.project.acarproject.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class Car extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long carIdx;

    @ManyToOne( fetch = FetchType.LAZY)
    private GarageLocation garageLocation;


    @Column(length = 8, nullable = false)
    private String carNumber;

    @Column(length = 10, columnDefinition = "TINYINT(1)")
    private Long carKindCode;

    @Column(nullable = false)
    private Integer carNormalCost;

    @Column(nullable = false)
    private Integer carKmCost;

    @Column(length = 5, nullable = false)
    private String carFuelKind;

    @Column(nullable = false)
    private Integer carMilege;

    @Column(length = 4, columnDefinition = "TINYINT(1)")
    private Long carStateCode;

    @Column(nullable = false)
    private Integer carLentCount;

    @Column(length = 10, nullable = true)
    private String carPictureFile;
}
