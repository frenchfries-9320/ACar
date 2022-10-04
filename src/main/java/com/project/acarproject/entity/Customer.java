package com.project.acarproject.entity;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Customer")
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data
public class Customer extends BaseEntity{


    @Id
    private String email;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.REMOVE, mappedBy = "email",orphanRemoval=true)
    private List<CustomerCreditCardInfo> CustomerCreditCardInfo = new ArrayList<>();

    @Column(length = 30, nullable = false)
    private String password;

    @Column(length = 20, nullable = false)
    private String driveLisenceNumber;

    @Column(length = 30, nullable = false)
    private String comtomerAddress;

    @Column(length = 1, columnDefinition = "TINYINT(1)")
    private Long Customer_state;

    @Column(length = 10, nullable = false)
    private String Name;

    @Column(length = 50, nullable = true)
    private String profileFile;

    @Column(length = 30, nullable = false)
    private LocalDateTime customerEndTime;








}
