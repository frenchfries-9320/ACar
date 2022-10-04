package com.project.acarproject.entity;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class Lent extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long lentIdx;

    @ManyToOne(fetch = FetchType.LAZY)
    private Customer email;

    @OneToOne(fetch = FetchType.EAGER)
    private Car carIdx;

    @OneToOne(fetch = FetchType.LAZY)
    private GarageLocation garageLocation;

    @Temporal(TemporalType.TIMESTAMP)
    private String lentStartDate;

    @Column(length = 30, nullable = false)
    private LocalDateTime lentEndDate;

    @Column(length = 15, nullable = false)
    private LocalDateTime lentMoney;


}
