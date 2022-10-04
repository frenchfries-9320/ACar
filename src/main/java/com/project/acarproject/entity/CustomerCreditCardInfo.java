package com.project.acarproject.entity;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;


@Entity
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data
public class CustomerCreditCardInfo extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long creditCardIdx;

    @ManyToOne(fetch = FetchType.LAZY)
    private  Customer email;

    @Column(length = 10, nullable = false)
    private String cardCompany;

    @Column(length = 16, nullable = false)
    private String cardNumber;

    @Column(length = 4, nullable = false)
    private String cardPassword;

    @Column(length = 4, nullable = false)
    private LocalDate cardExpireYear;

    @Column(length = 2, nullable = false)
    private LocalDate cardExpireMonth;

    @Column(length = 3, nullable = false)
    private String CVV;

}
