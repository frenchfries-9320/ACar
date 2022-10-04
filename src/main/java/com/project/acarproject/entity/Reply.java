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
public class Reply extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long replyIdx;

    @ManyToOne
    private Review reviewIdx;
    @ManyToOne
    private Customer email;

    @Column(nullable = false)
    private String content;
    
    //등록날
    //수정날


}
