package com.project.acarproject.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data
public class GarageCompany extends BaseEntity{

    @Id
    private Long garageCompanyIdx;

    @Column(length = 30, nullable = false)
    private String garageAddress;

    @Column(length = 30, nullable = false)
    private LocalDateTime garageLentDate;

    @Column(length = 30, nullable = false)
    private LocalDateTime garageLentEndDate;


}
