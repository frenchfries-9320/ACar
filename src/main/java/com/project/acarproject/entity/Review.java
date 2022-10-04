package com.project.acarproject.entity;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data
public class Review extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long reviewIdx;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.REMOVE, mappedBy = "reviewIdx",orphanRemoval=true)
    private List<Review> CustomerCreditCardInfo = new ArrayList<>();

    @ManyToOne
    private Customer email;

    @ManyToOne
    private Car car;

    @ManyToOne
    private Lent lent;

    @Column(nullable = false)
    private Double starScore;

    @Column(length = 30, nullable = false)
    private String title;

    @Column(nullable = false)
    private String content;

    //업로드날
    //수정날
    @Column(nullable = false)
    private Integer viewerCount;

    @Column(nullable = false)
    private Integer likeCount;

    @Column(length = 50, nullable = true)
    private String reviewPicture1;

    @Column(length = 50, nullable = true)
    private String reviewPicture2;

    @Column(length = 50, nullable = true)
    private String reviewPicture3;

    @Column(length = 50, nullable = true)
    private String reviewPicture4;

    @Column(length = 50, nullable = true)
    private String reviewPicture5;





}
