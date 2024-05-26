package com.crowbellx.desafio.model;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity(name = "tb_account")
public record Account(
         @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
         Long id,

         @Column(unique = true)
         String number,

         String agency,

         @Column(name = "additional_limit", scale = 13, precision = 2)
         BigDecimal balance,

         @Column(scale = 2, precision = 13)
         BigDecimal limit
) {
}
