package com.example.springjpa.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.annotation.Reference;

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
    @JoinColumn(name = "created_by")
    @JsonIgnoreProperties(value = "posts")

    private User user;
}
