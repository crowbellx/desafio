package com.crowbellx.desafio.model;

import jakarta.persistence.*;

import java.util.List;

@Entity(name = "tb_user")
public record User(
        @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
        Long id,

        String name,

        String lastName,

        @OneToOne(cascade = CascadeType.ALL)
        Account account,

        @OneToOne(cascade = CascadeType.ALL)
        Card card,

        @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
        List<Feature> features,

        @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
        List<News> news
) {
}
