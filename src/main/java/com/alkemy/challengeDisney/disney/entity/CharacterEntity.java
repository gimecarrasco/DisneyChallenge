package com.alkemy.challengeDisney.disney.entity;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "character")
@Getter
@Setter
public class CharacterEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private String image;

    private String name;

    private Integer age;

    private Double weight;

    private String history;

    @ManyToMany (mappedBy = "characters", cascade = CascadeType.ALL)
    private Set<MovieEntity> movies = new HashSet<>();
}
