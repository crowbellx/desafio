package com.crowbellx.desafio.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name = "tb_feature")
public record Feature(
        @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
        Long id,
        String icon,
        String description
) {
}
