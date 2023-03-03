package com.example.springjpa.domain;

import jakarta.persistence.*;
import lombok.*;

import java.time.Instant;

@Entity
@Table(name = "post")
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String title;

    @Column(updatable = false, name = "created_date")
    private Instant createdDate = Instant.now();

    @ManyToOne
    @JoinColumn(name = "created_by", updatable = false)
    private User user;
}
