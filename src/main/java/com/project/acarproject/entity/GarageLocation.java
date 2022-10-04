package com.project.acarproject.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data
public class GarageLocation extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long GarageIdx;

    @OneToOne(fetch = FetchType.LAZY)
    private Lent lent;

    @ManyToOne(fetch = FetchType.LAZY)
    private GarageCompany garageCompany;


    @Column(nullable = false)
    private Double locationX;

    @Column(nullable = false)
    private Double locationY;
}
