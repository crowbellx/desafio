package com.crowbellx.desafio.model;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity(name = "tb_card")
public record Card(
        @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
        Long id,

        @Column(unique = true)
        String number,

        @Column(name = "available_limit",scale = 2, precision = 13)
        BigDecimal limit
) {
}
