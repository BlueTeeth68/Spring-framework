package com.example.springjpa.domain;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

@Entity
@Table(name = "keyword")
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@IdClass(KeywordId.class)
public class KeyWord {

    @Id
    @Column(name = "name")
    private String name;

    @Column(name = "post_id")
    private Long postId;

}
